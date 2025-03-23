<?php
$host = "localhost";
$user = "root";
$pass = "";
$db = "sistem_data";

$conn = new mysqli($host, $user, $pass, $db);

if ($conn->connect_error) {
    die("Koneksi gagal: " . $conn->connect_error);
} else {
    echo "Berhasil terhubung dengan basis data";
}
?>