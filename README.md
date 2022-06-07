# homeworkJavaOOP2
Задание на тему Наследование

Уровень 1:

1) Создать класс Animal.
У него должны быть поля:
● String ration (чем питается животное)
● String color (какого оно цвета)
● int weight (вес) 
 Методы:
● Стандартные (методы получения и установки, toString() и т. д.)
● String getVoice() (подать голос)
● void eat() (есть)
● void sleep() (спать)

2) Создать классы Cat, Dog как подклассы Animal. Добавьте новое поле String name. Переопределите методы 
getVoice(), eat(), sleep().

3) Создайте класс Veterinarian.
 Поля:
● String name
 Методы:
● Стандартные
● void treatment(Animal animal) (Лечение животного. Лечить можно и кошек и собак)

Уровень 2:

1) Создайте класс TextTransformer.
Метод:
● String transform(String text) — Переводит текст в верхний регистр. Пример hello→ HELLO

2) Создайте класс InverseTransformer как подкласс TextTransformer. Переопределите метод String 
transform(String text) — Производит реверс текста. Пример hello → olleh

3) Создайте класс UpDownTransformer как подкласс TextTransformer. Переопределите метод String 
transform(String text) — Каждая нечетная буква большая, четная маленькая. Пример hello → HeLlO

4) Создайте класс TextSaver.
Поля:
● TextTransformer transformer
● File file
Методы:
● void saveTextToFile(String text) — Сначала преобразует одним из трансформеров (поле 
transformer) строку, после чего сохранить ее в файл(поле file)
