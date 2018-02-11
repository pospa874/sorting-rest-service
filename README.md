# Sorting REST service

#### Specification
Create a Java REST web service, which will accept array of Integers and return this array sorted.
Both input and output will be in a JSON format.

##### Input format:
```
{
    "descending":false,
    "array": [
        9,
        7,
        3,
        15
    ]
}
```

“descending” flag in input means that the array should be sorted in descending order if set to true, in
ascending order otherwise
You must implement the sorting algorithm yourself, do not use JDK sort or any existing libraries.

#### What you’ll need
    - JDK 1.8 or later
    - Maven 3.0+
    
#### How to run:
Open command line and execute following command in root folder of project:
    `mvn package && java -jar target/sortservice-0.1.0-SNAPSHOT.jar`
    
#### Usage:
```
    POST /sort HTTP/1.1
    Host: localhost:8080
    Content-Type: application/json
    {
        "descending":false,
        "array":[
            9,
            7,
            3,
            15,
            -3
        ]
    }
```

#### Output:
```
{
    "integers": [
        -3,
        3,
        7,
        9,
        15
    ]
}
```
