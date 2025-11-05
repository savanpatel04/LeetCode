import os, json, subprocess, datetime, shutil

REPO_PATH = "/Users/savandesai/WorkSpace/LeetCode"  # e.g., /Users/savan/Desktop/leetcode-repo
METADATA_FILE = "leetcode_metadata.json"

# Load metadata
with open(METADATA_FILE, "r") as f:
    problems = json.load(f)

# Find next unuploaded problem
next_problem = next((p for p in problems if not p["uploaded"]), None)
if not next_problem:
    print("✅ All problems uploaded!")
    exit()

# Paths
source = os.path.join("exported_archive", next_problem["folder"], next_problem["file"])
destination = os.path.join(REPO_PATH, "exported_archive", next_problem["upload_name"])

# Copy file with new name
shutil.copy(source, destination)
print(f"Copied {next_problem['problem_name']} to repo as {next_problem['upload_name']}")

# Git commands
os.chdir(REPO_PATH)
subprocess.run(["git", "add", "."])
commit_message = f"Add {next_problem['problem_name']} solution - {datetime.date.today()}"
subprocess.run(["git", "commit", "-m", commit_message])
subprocess.run(["git", "push"])

# Mark as uploaded
next_problem["uploaded"] = True
with open(os.path.join(os.path.dirname(METADATA_FILE), METADATA_FILE), "w") as f:
    json.dump(problems, f, indent=4)

# Log progress
with open("upload_log.txt", "a") as log:
    log.write(f"{datetime.datetime.now()} - Uploaded {next_problem['problem_name']}\n")

print(f"✅ Uploaded {next_problem['problem_name']} successfully.")
