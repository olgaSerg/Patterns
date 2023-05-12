package com.example.patterns

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.patterns.behavioral.command.Broker
import com.example.patterns.behavioral.command.BuyStock
import com.example.patterns.behavioral.command.SellStock
import com.example.patterns.behavioral.command.Stock
import com.example.patterns.behavioral.mediator.User
import com.example.patterns.behavioral.memento.CareTaker
import com.example.patterns.behavioral.memento.Creator
import com.example.patterns.creational.abstract_factory.AbstractFactory
import com.example.patterns.creational.factory_method.BakeryFactory
import com.example.patterns.creational.factory_method.BakeryProduct
import com.example.patterns.creational.prototype.Rectangle
import com.example.patterns.creational.prototype.Square
import com.example.patterns.structural.adapter.AudioPlayer
import com.example.patterns.structural.bridge.Circle
import com.example.patterns.structural.bridge.GreenCircle
import com.example.patterns.structural.bridge.RedCircle
import com.example.patterns.structural.bridge.Shape
import com.example.patterns.structural.decorator.CircleDecorator
import com.example.patterns.structural.decorator.RectangleDecorator
import com.example.patterns.structural.decorator.RedShapeDecorator
import com.example.patterns.structural.decorator.ShapeInterface
import com.example.patterns.structural.facade.ShapeMaker


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        createFactoryMethodPattern()
//        createAbstractFactoryPattern()
//        createPrototypePattern()
//        createAdapterPattern()
//        createBridgePattern()
//        createDecoratorPattern()
//        createFacadePattern()
//        createCommandPattern()
//        createMediatorPattern()
        createMementoPattern()
    }

    private fun createFactoryMethodPattern() {
        val bakeryFactory = BakeryFactory()
        val baguette = bakeryFactory.getBakery(BakeryFactory.BAG)
        val bread = bakeryFactory.getBakery(BakeryFactory.BREAD)
        val pie = bakeryFactory.getBakery(BakeryFactory.PIE)

        sellBakeryProduct(baguette)

        Log.d("!!BakeryFactory", "name: ${baguette.name()}, calories: ${baguette.calories()}")
        Log.d("!!BakeryFactory", "name: ${bread.name()}, calories: ${bread.calories()}")
        Log.d("!!BakeryFactory", "name: ${pie.name()}, calories: ${pie.calories()}")
    }

    private fun sellBakeryProduct(product: BakeryProduct) {
        Log.d("!!BakeryProduct", "${product.name()} sold")
    }

    private fun createAbstractFactoryPattern() {
        val factoryFirst = AbstractFactory.getFactory(1)
        val chairFirst = factoryFirst.createChair()
        val sofaFirst = factoryFirst.createSofa()
        val coffeeTableFirst = factoryFirst.createCoffeeTable()

        val factorySecond = AbstractFactory.getFactory(2)
        val chairSecond = factorySecond.createChair()
        val sofaSecond = factorySecond.createSofa()
        val coffeeTableSecond = factorySecond.createCoffeeTable()

        Log.d("!!AbstractFactory", chairFirst.getName())
        Log.d("!!AbstractFactory", sofaFirst.getName())
        Log.d("!!AbstractFactory", coffeeTableFirst.getName())
        Log.d("!!AbstractFactory", chairSecond.getName())
        Log.d("!!AbstractFactory", sofaSecond.getName())
        Log.d("!!AbstractFactory", coffeeTableSecond.getName())
    }

    private fun createPrototypePattern() {
        val square = Square("1", "square")
        val rectangle = Rectangle("2", "rectangle")

        val squareClone = square.cloneObject()
        val rectangleClone = rectangle.cloneObject()

        Log.d("!!Prototype", "square: ${square.hashCode()}")
        Log.d("!!Prototype", "squareClone: ${squareClone.hashCode()}")
        Log.d("!!Prototype", (squareClone == square).toString())

        Log.d("!!Prototype", "rectangle: ${rectangle.hashCode()}")
        Log.d("!!Prototype", "rectangleClone: ${rectangleClone.hashCode()}")
        Log.d("!!Prototype", (rectangleClone == rectangle).toString())
    }

    private fun createAdapterPattern() {
        val audioPlayer = AudioPlayer()

        audioPlayer.play("mp3", "beyond the horizon.mp3")
        audioPlayer.play("mp4", "alone.mp4")
        audioPlayer.play("avi", "far far away.avi")
    }

    private fun createBridgePattern() {
        val redCircle: Shape = Circle(100, 100, 10, RedCircle())
        val greenCircle: Shape = Circle(100, 100, 10, GreenCircle())

        redCircle.draw()
        greenCircle.draw()
    }

    private fun createDecoratorPattern() {
        val circle: ShapeInterface = CircleDecorator("Circle")
        val redCircle: ShapeInterface = RedShapeDecorator(CircleDecorator("Circle"))
        val redRectangle: ShapeInterface = RedShapeDecorator(RectangleDecorator("Rectangle"))

        Log.d("!!!DecoratorTitle", "Circle with normal border")
        circle.draw()

        Log.d("!!!DecoratorTitle", "Circle of red border")
        redCircle.draw()

        Log.d("!!!DecoratorTitle", "Rectangle of red border")
        redRectangle.draw()
    }

    private fun createFacadePattern() {
        val shapeMaker = ShapeMaker()

        shapeMaker.drawCircle()
        shapeMaker.drawRectangle()
        shapeMaker.drawSquare()
    }

    private fun createCommandPattern() {
        val abcStock = Stock()

        val buyStockOrder = BuyStock(abcStock)
        val sellStockOrder = SellStock(abcStock)

        val broker = Broker()
        broker.takeOrder(buyStockOrder)
        broker.takeOrder(sellStockOrder)

        broker.placeOrders()
    }

    private fun createMediatorPattern() {
        val robert = User("Robert")
        val john = User("John")

        robert.sendMessage("Hi! John!")
        john.sendMessage("Hello! Robert!")
    }

    private fun createMementoPattern() {
        val creator = Creator()
        val careTaker = CareTaker()

        creator.setNewState("State #2")
        careTaker.add(creator.saveStateToMemento())

        creator.setNewState("State #3")
        careTaker.add(creator.saveStateToMemento())

        creator.setNewState("State #4")
        careTaker.add(creator.saveStateToMemento())

        Log.d("!!!MementoPattern","Current State: " + creator.state)

        creator.getStateFromMemento(careTaker[0])
        Log.d("!!!MementoPattern","First saved State: " + creator.state)
        creator.getStateFromMemento(careTaker[1])
        Log.d("!!!MementoPattern","Second saved State: " + creator.state)
    }
}