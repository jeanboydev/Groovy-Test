/**
 * 默认都是 public
 */
class Person {

    String name
    Integer age

    def increaseAge(Integer year) {
        this.name += year
    }
}
