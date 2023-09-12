# [Курсовой проект "Сетевой чат"](https://github.com/netology-code/jd-homeworks/blob/master/diploma/networkchat.md)


## Краткое описание проекта

Разработан чат, состоящий из двух приложений (сервер, клиент) для обмена текстовыми сообщениями по сети с помощью консоли (терминала) между двумя и более пользователями.

**Первое приложение - сервер чата**, ожидает подключения пользователей.

**Второе приложение - клиент чата**, подключается к серверу чата и осуществляет доставку и получение новых сообщений.

Все события (сообщения пользователей, уведомления о новых пользователях чата, информация об ошибках)  записываются в log.txt, который дополняется при каждом запуске, а также при отправленном или полученном сообщении. Выход из чата осуществляется по команде "exit".


## Описание реализации

- Сервер умеет одновременно ожидать новых пользователей и обрабатывать поступающие сообщения от пользователей;
- Использован сборщик пакетов **Maven**;
- В качестве файла настроек используется **settings.properties**;
- Запись логов в файл **log.txt**;
- Код размещен на **github**;
- Код покрыт **unit**-тестами.


## Описание сервера

- Порт для подключения клиентов устанавливается через файл настроек settings.properties;
- Возможность подключиться к серверу в любой момент и присоединиться к чату;
- Отправка новых сообщений клиентам;
- Запись всех отправленных через сервер сообщений с указанием имени пользователя и времени отправки в log.txt.


## Описание клиента

- Выбор имени для участия в чате;
- Настройки приложения (порт и хост) из файла настроек settings.properties;
- Подключение к указанному в настройках серверу;
- Для выхода из чата набрать команду выхода - **“exit”**;
- Каждое сообщение записывается в **log.txt**.


## Особенности запуска чата

- Первым для корректной работы необходимо запустить Сервер (используем этот [класс](src/main/java/ru/netology/dolgosheev/server/MainServer.java)).
- Затем запускаем Клиент (используем этот [класс](src/main/java/ru/netology/dolgosheev/client/MainClient.java)). 
  Для запуска нескольких копий клиента (возможности участия нескольких пользователей в чате) необходимо в Intellij IDEA включить настройку возможности запуска нескольких копий программы (Allow multiple instances).