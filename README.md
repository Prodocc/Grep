# Grep
Вариант 3 -- grep
Вывод на консоль указанного (в аргументе командной строки) текстового файла с фильтрацией:
● word задаёт слово для поиска (на консоль выводятся только содержащие его строки)
● -r (regex) вместо слова задаёт регулярное выражение для поиска (на консоль выводятся только строки, содержащие данное выражение)
● -v инвертирует условие фильтрации (выводится только то, что ему НЕ соответствует)
● -i игнорировать регистр слов
Command Line: grep [-v] [-i] [-r] word inputname.txt
Кроме самой программы, следует написать автоматические тесты к ней.
