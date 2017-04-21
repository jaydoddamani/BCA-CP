<html>
<body>
<table border=1>
    <?php
        $n=$_POST["no1"];
        for($i=0;$i<=10;$i++)
        {
            echo "<tr>";
            echo "<td>";
            echo $n * $i;
            echo "</td>";
            echo "</tr>";
        }
    ?>
</body>
</html>