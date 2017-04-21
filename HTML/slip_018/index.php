<html>
<?php
    $day=date('D');
    echo $day;
    if($day=="Mon")
    {
        echo '<body style="background-color:red">';
    }
    if($day=="Tue")
    {
        echo '<body style="background-color:blue">';
    }
    if($day=="Wed")
    {
        echo '<body style="background-color:green">';
    }
    if($day=="Thurs")
    {
        echo '<body style="background-color:black">';
    }
    if($day=="Fri")
    {
        echo '<body style="background-color:yellow">';
    }
    if($day=="Sat")
    {
        echo '<body style="background-color:orange">';
    }
    if($day=="Sun")
    {
        echo '<body style="background-color:pink">';
    }
?>
</html>