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





How to Run
Prerequisites
Java Development Kit (JDK): Version 8 or above
A terminal or command prompt to execute Java programs
Steps
Clone the repository:

bash
Copy code
git clone https://github.com/<your-username>/BasicShellEmulator.git
cd BasicShellEmulator
Compile the code:

bash
Copy code
javac -d out src/main/ShellEmulator.java src/utils/CommandExecutor.java
Run the emulator:

bash
Copy code
java -cp out main.ShellEmulator
Usage
Commands
Command	Description
ls	Lists files and directories in the current directory.
cd <path>	Changes the current directory to <path>.
mkdir <name>	Creates a new directory with the name <name>.
greet <name>	Prints a greeting message with <name>.
exit	Exits the shell.
Example Session
plaintext
Copy code
Welcome to the Basic Shell Emulator!
Type 'exit' to quit.

D:\OS\Shell > ls
src
README.md
out

D:\OS\Shell > mkdir testFolder
Directory created: D:\OS\Shell\testFolder

D:\OS\Shell > cd testFolder
D:\OS\Shell\testFolder > greet User
Hello, User!

D:\OS\Shell\testFolder > exit
Exiting Shell. Goodbye!
Contribution
Contributions are welcome! Please fork the repository and submit a pull request with any enhancements or bug fixes.


