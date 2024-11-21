# 🌟 Basic Shell Emulator 🌟

A **Java-based shell emulator** that brings terminal functionalities like `ls`, `cd`, and `mkdir` to life! It’s a great project for understanding operating system concepts, process management, and custom command execution in Java.

---

## 🚀 Features

- **Core Commands:**
  - 🔍 `ls` - List files and directories in the current directory.
  - 📂 `cd` - Navigate between directories.
  - 🗂️ `mkdir` - Create new directories.
- **Custom Command:**
  - 🤝 `greet <name>` - Prints a personalized greeting.
- **System Command Support:**
  - 🖥️ Execute system-level commands like `dir` or `echo`.
- **Error Handling:**
  - ❌ Handles invalid commands gracefully.

---

## 📂 Project Structure

```plaintext
BasicShellEmulator/
├── src/
│   ├── main/
│   │   ├── ShellEmulator.java     # Main entry point of the program
│   ├── utils/
│       ├── CommandExecutor.java  # Handles command logic
├── out/                          # Compiled .class files (after build)
├── .gitignore                    # Files to exclude from Git
├── README.md                     # Documentation (this file)
