package hr.ferit.patrikcupic.myapplication.data

class Robot(private var x: Int = 0, private var y: Int = 0) {

    fun goRight(steps: Int) {
        x += steps
    }

    fun goLeft(steps: Int) {
        x -= steps
    }

    fun goDown(steps: Int) {
        y -= steps
    }

    fun goUp(steps: Int) {
        y += steps
    }

    fun getLocation(): String {
        return "Location of the robot is ($x, $y)"
    }
}