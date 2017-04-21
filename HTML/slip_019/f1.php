<html>
<head>
<?php
    $no=$_POST["no"];
    $rev=0;
    $dig=0;
    $arr=array("Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine");
    while($no >0)
    {
        $dig=$no %10;
        $rev=($rev * 10)+($dig);
        $no=(int)($no/10);
    }
    while($rev>0)
    {
        $dig=$rev%10;
        echo " " .$arr[$dig];
        $rev=(int)($rev/10);
    }
?>
</html>