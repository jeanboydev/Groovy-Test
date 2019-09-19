import groovy.json.JsonOutput
import groovy.json.JsonParser
import groovy.json.JsonSlurper

def list = [new Person(name: "haha", age: 10), new Person(name: "hehe", age: 22)]
println JsonOutput.toJson(list)
JsonSlurper.parse("")


def file = new File("")
file.each { line ->
    println line
}