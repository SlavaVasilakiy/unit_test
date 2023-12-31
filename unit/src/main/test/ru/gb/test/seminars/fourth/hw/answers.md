## Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

Тестовые заглушки помогают изолировать тестируемый компонент от внешних зависимостей, таких как базы данных, API или другие сервисы. Это позволяет тестировать компоненты независимо, упрощает отладку и ускоряет выполнение тестов.


## Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

В этом случае подходит Mock-объект. Mock-объект имитирует поведение реального объекта и позволяет проверить, был ли вызван метод с определенными аргументами.


## Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

Здесь подходит Stub-объект. Он предоставляет фиксированный ответ при вызове метода и не проверяет, был ли метод вызван с определенными аргументами.


## Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?

Для имитации взаимодействия с внешним API или базой данных использовал бы Fake-объект. Он предоставляет реализацию, которая не является полноценной, но позволяет тестировать логику вашего кода без реального взаимодействия с внешними сервисами.