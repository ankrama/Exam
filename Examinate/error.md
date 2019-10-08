Запуск программы:
```
"C:\Program Files\Java\jdk-12.0.1\bin\java.exe" "-javaagent:E:\Program Files\JetBrains\IntelliJ IDEA 2019.1.2\lib\idea_rt.jar=5309:E:\Program Files\JetBrains\IntelliJ IDEA 2019.1.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\max\Desktop\exams\Boroday\Examinate\out\production\Examinate Exam
Манул: 
       - dir — выводит список файлов в текущей директории
       - cd «путь» — перейти в директорию, путь к которой задан первым аргументом
       - pwd — вывести полный путь до текущей директории
       - cat «имя_файла» - выводит содержимое текстового файла «имя_файла»

Введите команду: dir
[DIR]          .idea     
140            byhart.txt
433            Examinate.iml
[DIR]          out       
[DIR]          src       
Введите команду: cd src
Введите команду: dir
[DIR]          org       
Введите команду: cd org
Введите команду: dir
Exception in thread "main" java.lang.NullPointerException
	at org.itstep.Dir.perform(Dir.java:13)
	at Exam.main(Exam.java:30)

Process finished with exit code 1
```
