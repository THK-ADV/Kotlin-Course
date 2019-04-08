interface Drawable {
    fun draw()
}

open class Smiley: Drawable {
    override fun draw() {
        println(":-)")
    }
}

class HairySmiley: Smiley() {
    override fun draw() {
        print("?")
        super.draw()
    }
}