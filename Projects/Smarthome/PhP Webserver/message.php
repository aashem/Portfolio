<?php
$my_file ='test.txt';

echo
"<form action='' method='post'>
<input type='submit' name='LED1O' value='LED1'/>
<input type='submit' name='LED1X' value='LED1X'>
<input type='submit' name='LED2O' value='LED2'/>
<input type='submit' name='LED2X' value='LED2X'>
<input type='submit' name='Clear' value='Clear contents' />
<input type='submit' name='Show' value='Show contents'/>
</form>";





if(isset($_POST['LED1O']))
{
	echo $_POST['LED1O'];
	
	$handle = fopen($my_file, 'a') or die ('Cannot open file:'.$my_file);
	$data = $_POST['LED1O'];
	fwrite($handle, $data );
	fclose($handle);
}
else if(isset($_POST['LED1X']))
{
	echo $_POST['LED1X'];
	
	$handle = fopen($my_file, 'a') or die ('Cannot open file:'.$my_file);
	$data = $_POST['LED1X'];
	fwrite($handle, $data );
	fclose($handle);
}
if(isset($_POST['LED2O']))
{
	echo $_POST['LED2O'];
	
	$handle = fopen($my_file, 'a') or die ('Cannot open file:'.$my_file);
	$data = $_POST['LED2O'];
	fwrite($handle, $data );
	fclose($handle);
}
else if(isset($_POST['LED2X']))
{
	echo $_POST['LED2X'];
	
	$handle = fopen($my_file, 'a') or die ('Cannot open file:'.$my_file);
	$data = $_POST['LED2X'];
	fwrite($handle, $data );
	fclose($handle);
}

if(isset($_POST['Clear']))
{
	
	fopen($my_file, 'w') or die ('cannot open file:'.$my_file);	
	echo "$my_file has been cleared";
	fclose($my_file);
}
if(isset($_POST['Show']))
{
	fopen($my_file, 'r') or die('cannot open file:'.$my_file);
	echo file_get_contents($my_file);
	fclose($my_file);
}
?>