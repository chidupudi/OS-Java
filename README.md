# Basic Shell Emulator

A **Java-based shell emulator** that mimics basic terminal functionalities like `ls`, `cd`, and `mkdir`, with support for custom commands. Ideal for learning operating system concepts and process management in Java.

---

## Features

- **Basic Commands**:
  - `ls` - List files and directories in the current directory.
  - `cd` - Change the current directory.
  - `mkdir` - Create a new directory.
- **Custom Command**:
  - `greet <name>` - Prints a custom greeting message.
- **System Command Support**:
  - Supports executing system-level commands (e.g., `dir`, `echo`).
- Graceful handling of invalid commands or errors.

---

## Project Structure

```plaintext
BasicShellEmulator/
├── src/
│   ├── main/
│   │   ├── ShellEmulator.java     # Main program entry point
│   ├── utils/
│       ├── CommandExecutor.java  # Command handling logic
├── out/                          # Compiled .class files (generated after build)
├── .gitignore                    # Files to exclude from Git
├── README.md                     # Project documentation
