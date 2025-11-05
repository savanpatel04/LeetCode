import os, json

base_path = "exported_archive"
problems = []

for folder in sorted(os.listdir(base_path)):
    if os.path.isdir(os.path.join(base_path, folder)):
        # Extract clean name e.g. "two-sum" from "1-two-sum"
        problem_name = folder.split("-", 1)[1]
        folder_path = os.path.join(base_path, folder)
        java_files = [f for f in os.listdir(folder_path) if f.endswith(".java")]
        if java_files:
            problems.append({
                "folder": folder,
                "problem_name": problem_name,
                "file": java_files[0],
                "upload_name": f"{problem_name}.java",  # short name for GitHub
                "uploaded": False
            })

with open("leetcode_metadata.json", "w") as f:
    json.dump(problems, f, indent=4)

print(f"✅ Metadata created for {len(problems)} problems.")
