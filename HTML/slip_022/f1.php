<?php
    $string1 = $_POST["string1"];
    $string2 = $_POST["string2"];
    $replace = $_POST["replace"];
    $largeString="";
    $smallString="";

    if(strlen($string1)>strlen($string2)){
        $largeString=$string1;
        $smallString=$string2;        
    }
    else{
        $largeString=$string2;
        $smallString=$string1;
    }
    echo "<p>Large String:$largeString</p>";
    echo "<p>Small String:$smallString</p>";

    findOccurrences($largeString, $smallString);
    $stringWithReplace=str_replace($smallString,$replace, $largeString);
    echo"<p>Large String after replacing '$smallString with '$replace':$stringWithReplace</p>";

    function findOccurrences($largeString, $smallString){
    $firstOccurrence=strpos($largeString,$smallString);
    echo "<p>First Occurrences:$firstOccurrence</p>";
    $lastOccurrence=strrpos($largeString,$smallString);
    echo "<p>Last Occurrence:$lastOccurrence</p>";
    $occurCount=substr_count($largeString, $smallString);
    echo "<p>No. of Occurrences: $occurCount</p>";
    }

    function findOccurrences($largeString, $smallString){
        $firstOccurrence=strpos($largeString,$smallString);
        echo"<p>First Occurrence: $firstOccurrence</p>";
        $lastOccurrence=strrpos($largeString,$smallString);
        echo "<p>Last Occurrence:$lastOccurrence</p>";
    }
?>