```groovy
def myMethod(param) {
  if (param == null) {
    return null // This will cause the NullPointerException later
  }
  // ... other code that uses param ...
}

myMethod(someValue).someProperty // NullPointerException if someValue is null
```