# -*- coding: utf-8 -*-
"""BigData week 6 Wahyu Dwi.ipynb

Automatically generated by Colab.

Original file is located at
    https://colab.research.google.com/drive/10krBkEh0FmMywcJoAszoUHIy6Qop34If
"""

pip install pyspark

from pyspark.sql import SparkSession

# Inisialisasi SparkSession
spark = SparkSession.builder.appName('HandsOnPertemuan6').getOrCreate()

# Membuat data dan skema
data = [('James', 'Sales', 3000),
        ('Michael', 'Sales', 4300),
        ('Robert', 'Sales', 6000),
        ('Maria', 'Finance', 9000)]
columns = ['EmployeeName', 'Department', 'Salary']

# Membuat DataFrame
df = spark.createDataFrame(data, schema=columns)

# Menampilkan DataFrame
print("DataFrame Awal:")
df.show()

# Menampilkan Nama Karyawan dan Gaji
print("Nama Karyawan dan Gaji:")
df.select('EmployeeName', 'Salary').show()

# Filter Karyawan dengan Gaji Lebih dari 3000
print("Karyawan dengan Gaji Lebih dari 4300:")
df.filter(df['Salary'] > 4300).show()

# Menghitung Rata-rata Gaji per Departemen
print("Rata-rata Gaji per Departemen:")
df.groupBy('Department').avg('Salary').show()

# Menghitung Jumlah Karyawan per Departemen
print("Jumlah Karyawan per Departemen:")
df.groupBy('Department').count().show()

# Menghitung Jumlah Gaji per Departemen
print("Jumlah Gaji per Departemen:")
df.groupBy('Department').sum('Salary').show()

# Menghitung Gaji Maksimum per Departemen
print("Gaji Maksimum per Departemen:")
df.groupBy('Department').max('Salary').show()

# Menambahkan kolom SalaryBonus
df = df.withColumn('SalaryBonus', df['Salary'] * 0.1)

# Menambahkan kolom TotalCompensation
df = df.withColumn('TotalCompensation', df['Salary'] + df['SalaryBonus'])

# Menampilkan hasil
df.show()

from pyspark.sql import functions as F
from pyspark.sql.window import Window

# Membuat window specification
windowSpec = Window.partitionBy('Department').orderBy('Salary')

# Menambahkan kolom Rank berdasarkan window function
df_with_rank = df.withColumn('Rank', F.rank().over(windowSpec))

# Menampilkan DataFrame dengan Rank
print("DataFrame dengan Rank:")
df_with_rank.show()