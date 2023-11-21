import cars.Car
import cars.CarPrinter
import java.util.Scanner

fun main() {
    val carList = listOf(
        Car("Toyota", "Camry", "2.5L"),
        Car("Audi", "RS7", "1.8L"),
        Car("Ford", "Mustang", "5.0L")
    )

    val carPrinter = CarPrinter()

    println("Выберите автомобиль (введите номер):")
    carList.forEachIndexed { index, car ->
        println("${index + 1}. ${car.brand}")
    }

    val scanner = Scanner(System.`in`)
    print("Введите номер автомобиля: ")
    val selectedCarIndex = scanner.nextInt() - 1

    if (selectedCarIndex in 0 until carList.size) {
        val selectedCar = carList[selectedCarIndex]
        carPrinter.printCarInfo(selectedCar)
    } else {
        println("Неверный номер автомобиля.")
    }
}
