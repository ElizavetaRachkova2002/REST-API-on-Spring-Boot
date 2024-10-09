Реализация REST API приложения

В работе были использованы - Spring и Postman 

Для хранения данных используется БД Postgres 
Скрипт для создания табдицы приведён ниже 
create table product(
    id serial primary key, //PK
    name varchar(256), //Наименование товара
    amount int //Количество товара
)


По методу GET по адресу http://localhost:8080/products можем получить список продуктов 
![image](https://github.com/user-attachments/assets/bb1a0977-70c5-43da-a2b3-91c33ef985d8)

По методу POST по адресу http://localhost:8080/products/new и с json телом
                                                                              {
                                                                                  "name":"Product A",
                                                                                  "amount":5
                                                                              }
  можем добавить новый продукт в БД 

![image](https://github.com/user-attachments/assets/4e8adb1c-9a81-47ea-9ff0-189a76b810f0)

Проверим по методу GET, что товар был добавлен в БД 
![image](https://github.com/user-attachments/assets/1274be7b-3b2a-473f-96f3-69a26408dabb)

По методу PATCH можкм обновить сведения в БД, например, у товара с идентификатором 1 изменим атрибуты name и title
![image](https://github.com/user-attachments/assets/d832c075-1542-444d-915e-38aee44d4cca)

Проверим, что товар был изменён в БД по методу GET 
![image](https://github.com/user-attachments/assets/44063424-78d5-48b5-8458-da8ca4ca0c13)

Далее можем удалить товар по методу DELETE  http://localhost:8080/products/1
![image](https://github.com/user-attachments/assets/de2012f8-1ba9-4bd5-bdbd-983711885ae6)

И проверим, что товар был удалён из БД по меьтоду GET 
![image](https://github.com/user-attachments/assets/8e283179-3eb7-47e5-ae5e-116cf9b8f65c)










