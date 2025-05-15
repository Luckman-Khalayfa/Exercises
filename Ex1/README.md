# MiniShell

מסוף פקודות פשוט בג'אווה המדמה עבודה בסיסית עם מערכת קבצים.

## 📁 מבנה

- `ShellCommandHandler`: מנהל פעולות כמו `cd`, `ls`, `mkdir`, `touch`.
- `MiniShell`: קורא פקודות מהמשתמש ומפעיל אותן.

## ▶️ איך להפעיל

```bash
javac src/*.java
java -cp src MiniShell
```

## 🧪 דוגמה:

```
pwd
mkdir test
cd test
touch file1.txt
ls
cd ..
exit
```