<?php
include "db_connect.php";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nama = $_POST['nama'];
    $email = $_POST['email'];
    $alamat = $_POST['alamat'];

    $sql = "INSERT INTO daftar_pengguna (Nama, Email, Alamat) VALUES ('$nama', '$email', '$alamat')";
    
    if ($conn->query($sql) === TRUE) {
        echo "Data berhasil disimpan";
    } else {
        echo "Kesalahan: " . $sql . "<br>" . $conn->error;
    }
    
    $conn->close();
}
?>