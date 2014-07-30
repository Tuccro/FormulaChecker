FormulaChecker
==============
Имеется текстовый файл, в котором записаны формулы, одна строка — одна формула.
Необходимо прочитать формулы из файла и проверить, правильная ли формула.
Формула считается неправильной если в ней имеются открываюшие скобки, для которых нет закрывающих или наоборот, есть закрывающие, для которых нет открывающих.
Все неправильные формулы записать в другой файл и строчкой ниже символом ^ указать позиции неправильных скобок, для которых нет пары.
Пример файла:
in.txt
(a+b) — (a-b)
a*(a+b
d — 5*(s/((s+5) +5)+(5+f

результат работы:
out.txt
a*(a+b
  ^	
d — 5*(s/((s+5) +5)+(5+f
         ^          ^

Программа запускается из консоли, в качестве параметров программе передаются пути к файлу с формулами и путь к файлу, в который следует записать результат.
	