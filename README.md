# Main-Сlass-BE-Pro
Homework
ДЗ 1 :


1.Класс Person
Создать класс Person, который содержит:


переменные fullName, age;
методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то <имя> говорит" 
и -"Такой-то <имя> идет" 
Добавьте два конструктора  - Person() и Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age)


Вызовите у объектов методы move и talk


2.Класс Phone.
Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса. 
Выведите на консоль значения их переменных. 
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. 
Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона. 
Вызвать эти методы для каждого из объектов.


Homework ДЗ 3 :
 Задание 1 :Сгенерировать список из 500 целочисленных элементов
Достаточно создать объект Random random = new Random();
И в цикле добавлять случайное значение в список в виде int element = random.nextInt(10);

Имея данный список и знания полученный об интерфейсе Set ,
вывести в консоль:


1)отсортированный набор уникальных элементов
2)набор только уникальных элементов


Задание 2:
Взять две строки случайных символов ,длина каждой строки от 20 до 50 символов.
Вывести в консоль список символов которые встречаются только один раз на все две строки.

Homework ДЗ 4 
Создать лист, наполнить его 10М (миллионами) элементов.
Выполнить различные варианты обхода данного листа :
При выполнении операций обхода, для нагрузки, внутри тела циклов
кладем i- тый элемент в переменную temp
(Пример :
 for (int i : list) {
     int temp = i;
        })


перебрать for-each loop

classic for и вызываем внутри цикла list.size() для каждой итерации

classic for, но list.size() определяем в переменную

classic for, list.size() определяем в переменную, перебираем с конца (i--)

используя Itertor

используя ListIterator


для всех случаев(1-6) сделать замер времени как разобрали в начале прошлого урока.
результат вывести в консоль

Homework ДЗ 5 
 1) Книжная полка :
Есть объект книжная полка , есть объекты книги(10 штук), которые хранятся на этой книжной полке.
Книга должна иметь следующие поля : Название, год издания,количество страниц, Автор.
Автор должен иметь поля, имя, год рождения.

Вывести в консоль содержимое книжной полки в оригинальном виде.
Запросить с консоли варианты сортировки :
    1-По названию,2-По году издания, 3-По количеству страниц, 4-По году рождения автора.
В зависимости от введенного варианта , отсортировать книги на книжной полке.
(Должно быть создано 4 варианта компараторов для сортировки)


2) Автоприложение :
Из автоцентра выезжают автомобили (Класс Car, поля марка(может быть одна на несколько автомобилей),цвет, вин код(уникальный номер), рег номер(уникальный номер)).
Все автомобили проданные автосалоном попадают в список проданных машин.
Часть автомобилей продается в лизинг и попадает в специальную структуру(HashSet) которая хранит только лизинговые автомобили.
В течении времени, часть автомобилей из списка проданных, перепродается, меняются регистрационные номера, перекрашиваются.


Определить какие автомобили после всех изменений все еще находятся в лизинге.
Определять можно только используя метод contains для поиска по HashSet.

Homework ДЗ 6

 1) Игра пасьянс (задача на стек):
Создать колоду карт и наполнить ее картами.

Енамы со значениями карт : Rank, Suit
Отдельная карта : класс Card c полем типа Rank rank, полем типа Suit suit
Колода карт : класс Deck с полем List cards
При запуске перемешивать колоду (можно использовать метод shuffle класса Collections)


Раскладывать колоду в стопку по принципу :
Если в стопке две карты одной масти ложатся друг на друга, то их убираем из стопки.
В конце написать результат и вывести карты в стопке.
Пасьянс сошелся если осталось по 1 карте каждой масти (число карт каждой масти нечетное).


2)Имеется очередь пассажиров(класс Passenger), часть из которых является клиентами 1 ого класса, которые
должны идти на посадку первыми.
Написать приложение, которое создаст 10 пассжиров, из них 3 пассжира 1 ого класса.
Отправить всех в одну очередь, разбирать очередь пока она не станет пустая.
Пассажиры 1 ого класса должны быть в очереди первыми.


3)Приложение больница : Имеется регистратура(класс) , в которую обращаются пациенты (класс),
пациентов больше 15, очередь в регистратуру может состовлять 7 человек, заполнять очередь, пока в ней есть места (при создании очереди можно задавать размер!)
как только мест не хватает , остановить заполнения и начать обслуживать пациентов в очереди, назначать им терапию(класс)
и отправлять в очередь к доктору, очередь доктора должна обслуживать сначала критичных пациентов, потом обычных
Когда все пациенты из очереди разобраны в регистратуре, запустить новых и повторить процесс.
На каждом этапе выводить в консоль состояние пациента, (в регистратуре, у доктора, свободен)

Homework 7
 1 уровень сложности: 1) Сгененрировать список из 1000 элементов - целых чисел с помощью Random
   Сформировать структуру из которой будет понятно, сколко раз каждое число появилось в списке.
   Вывести в консоль данную информацию.

2) Турист 1 посетил следующие города за поездку : Берлин,Барселона,Валенсия,Париж
   Турист 2 посетил следующие города за поездку : Бонн, Дюссельдорф, Кёльн, Амстердам
   Создайте структуру , в которой можно хранить и получать города, для каждого туриста. 
   Структура должна быть одна для всех пользователей.
   Напишите метод, который добавит третьего туриста в данную структуру, со списком городов взятых у первого и второго туриста


3)    Мини игра(она действительно простая):
    С консоли два игрока , по очереди вводят название городов.
    Каждое введенное название города нужно запомнить в структуре данных.
    Но запоминать нужно не как строку, а как объект класса City, который содержит поле с названием города.
    Если игрок вводит название города , которое уже раньше использовалось , то увеличивать счетчик повторений на 1.
    Когда счетчик повторений достигнет 5 - игра останавливается и выводится список всех названных городов и список всех
    городов что были названые два и более раз.


4) Книжная полка :
   Есть объект книжная полка , есть объекты книги(10 штук), которые хранятся на этой книжной полке.
   Книга должна иметь следующие поля : Название, год издания,количество страниц, Автор.
   Автор должен иметь поля, имя, год рождения.


Вывести в консоль содержимое книжной полки в оригинальном виде.
   Запросить с консоли варианты сортировки :
        1-По названию,2-По году издания, 3-По количеству страниц, 4-По году рождения автора.
   В зависимости от введенного варианта , отсортировать книги на книжной полке.
   (Должно быть создано 4 варианта компараторов для сортировки)


5) Автоприложение :
    Из автоцентра выезжают автомобили (Класс Car, поля марка(может быть одна на несколько автомобилей),цвет, вин код(уникальный номер), рег номер(уникальный номер)).
    Все автомобили проданные автосалоном попадают в список проданных машин.
    Часть автомобилей продается в лизинг и попадает в специальную структуру(HashSet) которая хранит только лизинговые автомобили.
    В течении времени, часть автомобилей из списка проданных, перепродается, меняются регистрационные номера, перекрашиваются.


Определить какие автомобили после всех изменений все еще находятся в лизинге.
Определять можно только используя метод contains для поиска по HashSet. 

2 уровень сложности: 

Homework 8


 1 уровень сложности: 1.Есть объект - книжная полка.
Организовать хранение книг на книжной полке, в различном порядке, а именно:
По Автору, по году издания, по издательству.
Соответственно должен быть класс описывающий книгу.
У книги должны быть поля, наименование,автор,количество страниц, год издания, издательство.
Поля Автор и Издательство должны быть классами.
Класс автор содержит имя и фамилию автора и год рождения.
Класс издательство содержит название издательства и год основания.

В основном классе программы, создать 7 книг, со всеми полями(авторы, издательство)
Запросить с консоли выбор варианта сортировки книг на полке.
Отсортировать книги на полке по выбранному варианту. Вывести в консоль содержимое полки.
Компараторы должны быть сделаны в виде лямбда выражений


2.Дан массив пар, состоящий из двух строк с именами и фамилиями, 
отсортировать массив в возрастающем лексикографическом порядке имени, и если две строки одинаковы, отсортируйте их по фамилии.
(Можно заполнить массив своими данными)
Input:  { {"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"} }
Output:  { {"abc", "last"}, {"pklz", "yelp"}, {"ppza", "xyz"}, {"rpng", "note"} }


Компараторы должны быть сделаны в виде лямбда выражений


3.Выполнить сортировку в прямом и  обратном алфавитном порядке и удалить дубликаты.В качестве результата должно быть два списка прямой и обратный.(два стрима)
 List list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");


4.Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")


5.Есть класс Student, есть дополнительные классы, которые разделяют студентов на три группы :
FrontEndStudent,BackEndStudent,QAStudent.  (поля классов name,rate, finished,type)


Сформировать три списка, в каждом по 5 студентов каждого направления,
Поместить все три списка в один список-списков. Для этого потребуется установить взаимоотношения между 4! классами указанными выше, что бы можно было с данными классами работать в едином стиле.


Создать класс ProjectStrudent с полями (поля классов name,rate, type)


Начало одного стрима :


Написать стрим для данного списка - списков, в котором выбрать все студентов с рейтом более 4.5 и тех, кто закончил курс (поле finished), для каждого студента который попал под условие, в поле type установить значение типа FE,BE,QA в зависимости от того к какому типу класса он относится,переформировать всех в объекты класса ProjectStudent,(на этой точке должен быть стрим студентов ProjectStudent), вывести всю информацию о получившихся студентах в консоль, собрать данные в отдельный список.


Конец одного и того же стрима.
Тестовые данные студентов генерировать самостоятельно.

