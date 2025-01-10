```groovy
def myMethod(param) {
  if (param == null) {
    return null 
  }
  // ... other code that uses param ...
  return param
}

def myMethodSafe(param) {
  param?.someProperty // Safe Navigation Operator
}

myMethodSafe(someValue) ?: defaultValue // Elvis Operator handling null

//Alternative using the elvis operator directly in the method
def myMethodElvis(param) {
  return param?.someProperty ?: defaultValue
}
```