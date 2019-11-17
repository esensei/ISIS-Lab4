fun main() {
    val petrolEngine149 = PetrolEngine(149)
    val electroEngine259 = ElectroEngine(259)

    val someTransmission = Transmission("АКПП", "Полный", 5)

    val car1 = Car(petrolEngine149, someTransmission, "Серебристый", "Hyundai")
    val car2 = Car(electroEngine259, someTransmission, "Синий", "Tesla")

    println(value(car1, "fuel"))
    println(value(car2, "color"))
    println(value(car2, "fuel"))
}

fun value(intent: Any, fieldName: String): String? {
    val fullFieldName = "get${fieldName[0].toUpperCase()}${fieldName.drop(1)}"
    val methods = intent.javaClass.methods
    val getMethodsName = methods.filter { it.name.take(3) == "get" }.map { it.name }

    if (getMethodsName.contains(fullFieldName)) {
        return intent.javaClass.getMethod(fullFieldName).invoke(intent).toString()
    }

    for (i in methods) {
        val result = value(intent.javaClass.getMethod(i.name).invoke(intent), fieldName)
        if (result != null) return result
    }

    return null
}