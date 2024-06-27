-- create queries

-- вся таблица
SELECT * FROM jaegers;

-- только не уничтоженные роботы
SELECT * FROM jaegers WHERE status = 'Lives';

-- только роботы серии Mark 1 и Mark 4
SELECT * FROM jaegers WHERE mark IN ('Mark 1', 'Mark 4');

-- все роботы, кроме Mark-1 и Mark-4, отсортировав таблицу по убыванию по столбцу mark
SELECT * FROM jaegers WHERE mark NOT IN ('Mark 1', 'Mark 4') ORDER BY mark DESC;

-- информация о самых старых роботах
SELECT * FROM jaegers ORDER BY launch;

-- инфа из столбцов model_name, mark, launch, kaiju_kill тех роботов, которые уничтожили больше всех kaiju
SELECT model_name, mark, launch, kaiju_kill FROM jaegers ORDER BY kaiju_kill DESC;

-- средний вес роботов, округлив его до трех знаков после запятой
SELECT ROUND(AVG(weight), 3) AS average_weight FROM jaegers;

-- увеличьте на единицу количество уничтоженных kaiju у неразрушенных роботов, а затем отобразите таблицу
UPDATE jaegers SET kaiju_kill = kaiju_kill + 1 WHERE status = 'Lives';

-- удалите уничтоженных роботов, а затем отобразите оставшихся
SELECT * FROM jaegers WHERE status = 'Lives';