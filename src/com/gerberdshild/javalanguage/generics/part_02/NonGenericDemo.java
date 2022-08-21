package com.gerberdshild.javalanguage.generics.part_02;

//Функциональный эквивалент обобщению, без использования обобщений, за счет класса Object.
class NonGeneric {
    Object object;

    // Передаем констурктору ссылку на объект типа Object
    NonGeneric(Object object) {
        this.object = object;
    }

    // возвратить тип Object
    Object getObject() {
        return object;
    }

    // показать тип объекта object
    void showObject() {
        System.out.println("Объект object имеет тип: " + object.getClass().getName());
    }
}

public class NonGenericDemo {
    public static void main(String[] args) {
        // Создать объект типа NonGeneric, сохранить в нём объект типа Integer.
        // Выполняется автоупаковка.
        NonGeneric intObj = new NonGeneric(777);
        // Показать тип данных, хранящийся в переменной object
        intObj.showObject();
        // Получить значение переменной intObj, теперь требуется приведение типов
        int value = (Integer) intObj.getObject();
        System.out.println("Значение value = " + value);

        NonGeneric strObj = new NonGeneric("Тестовая строка для класса не обобщения.");
        strObj.showObject();
        String str = (String) strObj.getObject();
        System.out.println("Значение str = " + str);

        // такое теперь тоже возможно с точки зрения компилятора! но принципиально не
        // верно
        intObj = strObj;
        value = (Integer) intObj.getObject(); // приведёт к ошибке во время выполнения
    }
}
