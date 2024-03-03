<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Addition of Two Numbers</title>
</head>
<body>
    <h2>Addition of Two Numbers</h2>
    
    <label for="num1">Enter first number:</label>
    <input type="number" id="num1"><br><br>
    
    <label for="num2">Enter second number:</label>
    <input type="number" id="num2"><br><br>
    
    <button onclick="addNumbers()">Add</button><br><br>
    
    <p id="result"></p>

    <script>
        function addNumbers() {
            var num1 = parseInt(document.getElementById('num1').value);
            var num2 = parseInt(document.getElementById('num2').value);
            
            var sum = num1 + num2;
            
            document.getElementById('result').innerHTML = "Sum of " + num1 + " and " + num2 + " is: " + sum;
        }
    </script>
</body>
</html>
