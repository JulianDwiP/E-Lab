-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Sep 2020 pada 10.18
-- Versi server: 10.4.8-MariaDB
-- Versi PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `elab`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `username` varchar(17) NOT NULL,
  `email` varchar(25) NOT NULL,
  `password` varchar(255) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id`, `nama`, `username`, `email`, `password`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'terbang', 'DOG123', 'terbang123@gmail.com', '7h132132', '2020-08-14', '2020-08-14', '0000-00-00'),
(2, 'beben lol', 'wkwkwland007', 'wkwk007@gmail.com', 'qweryuuiygoi123', '2020-08-18', '0000-00-00', '0000-00-00'),
(3, 'beben lol', 'wkwkwland007', 'wkwk007@gmail.com', 'qweryuuiygoi123', '2020-08-18', '0000-00-00', '2020-08-18'),
(7, 'adi', 'adi', 'adi@gmail.com', '$2y$10$AAB5L6C7Bo', '2020-08-24', '0000-00-00', '0000-00-00'),
(8, 'axl race', 'axl', 'axl007@gmail.com', '$2y$10$QvkDLHq5y1njD1p.hcKSwOZ5USB/18PA0GW9KLEEdiOEMQqHJETXi', '2020-08-25', '0000-00-00', '0000-00-00'),
(9, 'admin', 'admin', 'admin@gmail.com', '$2y$10$tQMVESbj0F4Pw9DY1l1Bs.LFaTYhLRRnGUGPsYtit94YhR02w/Ota', '2020-08-28', '0000-00-00', '0000-00-00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `attachment_tugas`
--

CREATE TABLE `attachment_tugas` (
  `id_attachment` int(11) NOT NULL,
  `id_tugas` int(11) NOT NULL,
  `attchment` blob NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `attachment_work`
--

CREATE TABLE `attachment_work` (
  `id_attachment_work` int(11) NOT NULL,
  `id_work` int(11) NOT NULL,
  `attchment` longblob NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `billing`
--

CREATE TABLE `billing` (
  `id_billing` int(11) NOT NULL,
  `id_komputer` int(11) NOT NULL,
  `nis` varchar(11) NOT NULL,
  `date_time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `id_mapel` int(11) NOT NULL,
  `id_guru` int(11) NOT NULL,
  `jam_keluar` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `billing`
--

INSERT INTO `billing` (`id_billing`, `id_komputer`, `nis`, `date_time`, `id_mapel`, `id_guru`, `jam_keluar`, `created_at`, `updated_at`, `deleted_at`) VALUES
(4, 1, '98923', '2020-08-15 07:31:50', 1, 1, '2020-09-04 03:24:15', '2020-08-18', '0000-00-00', '0000-00-00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `guru`
--

CREATE TABLE `guru` (
  `id_guru` int(11) NOT NULL,
  `nip` varchar(17) NOT NULL,
  `nama_guru` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `username` varchar(25) NOT NULL,
  `pasword` varchar(255) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `guru`
--

INSERT INTO `guru` (`id_guru`, `nip`, `nama_guru`, `email`, `username`, `pasword`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, '007', 'Dadang Toroso', 'Toroso@gmail.com', 'dadangtoso007', 'soktau', '2020-08-18', '2020-08-19', '0000-00-00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `hari`
--

CREATE TABLE `hari` (
  `id_hari` int(11) NOT NULL,
  `hari` varchar(17) NOT NULL,
  `id_lab` int(11) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `hari`
--

INSERT INTO `hari` (`id_hari`, `hari`, `id_lab`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Selasa', 2, '2020-08-18', '2020-08-18', '0000-00-00'),
(2, 'Senin', 1, '2020-09-04', '0000-00-00', '0000-00-00'),
(3, 'Selasa', 1, '2020-09-04', '0000-00-00', '0000-00-00'),
(4, 'Rabu', 1, '2020-09-04', '0000-00-00', '0000-00-00'),
(5, 'Kamis', 1, '2020-09-04', '0000-00-00', '0000-00-00'),
(6, 'Jumat', 1, '2020-09-04', '0000-00-00', '0000-00-00'),
(7, 'Sabtu', 1, '2020-09-04', '0000-00-00', '0000-00-00'),
(8, 'Minggu', 1, '2020-09-04', '0000-00-00', '0000-00-00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jadwal_lab`
--

CREATE TABLE `jadwal_lab` (
  `id_jadwal_lab` int(11) NOT NULL,
  `id_kelas` int(11) NOT NULL,
  `id_hari` int(11) NOT NULL,
  `jam_mulai` time NOT NULL,
  `jam_selesai` time NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jadwal_lab`
--

INSERT INTO `jadwal_lab` (`id_jadwal_lab`, `id_kelas`, `id_hari`, `jam_mulai`, `jam_selesai`, `created_at`, `updated_at`, `deleted_at`) VALUES
(4, 3, 1, '22:44:44', '23:31:32', '2020-08-18', '2020-08-19', '0000-00-00'),
(5, 1, 1, '14:31:50', '16:00:00', '2020-08-19', '0000-00-00', '0000-00-00'),
(6, 1, 6, '07:00:00', '15:00:00', '2020-09-04', '0000-00-00', '0000-00-00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jadwal_mapel`
--

CREATE TABLE `jadwal_mapel` (
  `id_jadwal_mapel` int(11) NOT NULL,
  `id_kelas` int(11) NOT NULL,
  `id_jadwal_lab` int(11) NOT NULL,
  `id_mapel` int(11) NOT NULL,
  `id_guru` int(11) NOT NULL,
  `jam_mulai` time NOT NULL,
  `jam_selesai` time NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jadwal_mapel`
--

INSERT INTO `jadwal_mapel` (`id_jadwal_mapel`, `id_kelas`, `id_jadwal_lab`, `id_mapel`, `id_guru`, `jam_mulai`, `jam_selesai`, `created_at`, `updated_at`, `deleted_at`) VALUES
(6, 1, 4, 1, 1, '22:44:44', '23:31:32', '2020-08-19', '2020-08-19', '0000-00-00'),
(7, 1, 4, 1, 1, '22:31:50', '00:00:00', '2020-08-19', '0000-00-00', '0000-00-00'),
(8, 1, 6, 1, 1, '07:00:00', '15:00:00', '2020-09-04', '0000-00-00', '0000-00-00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kelas`
--

CREATE TABLE `kelas` (
  `id_kelas` int(11) NOT NULL,
  `nama_kelas` varchar(17) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kelas`
--

INSERT INTO `kelas` (`id_kelas`, `nama_kelas`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'X RPL A\r\n', '2020-08-13', '2020-08-14', '0000-00-00'),
(2, 'X RPL B', '2020-08-14', '0000-00-00', '0000-00-00'),
(3, 'XII RPL A ', '2020-08-18', '0000-00-00', '0000-00-00'),
(4, 'XII RPL C ', '2020-08-18', '0000-00-00', '0000-00-00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `komputer`
--

CREATE TABLE `komputer` (
  `id_komputer` int(11) NOT NULL,
  `nama_komputer` varchar(17) NOT NULL,
  `spesifikasi` varchar(25) NOT NULL,
  `id_lab` int(11) NOT NULL,
  `ip_address` varchar(17) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `komputer`
--

INSERT INTO `komputer` (`id_komputer`, `nama_komputer`, `spesifikasi`, `id_lab`, `ip_address`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'lab1-1', 'hfkfgdjdgdh', 1, '192.168.43.236', '2020-08-05', '2020-08-13', '0000-00-00'),
(2, 'kp-2', 'udshudhusiahduahsd', 2, '61133721321879128', '2020-08-13', '0000-00-00', '0000-00-00'),
(4, 'kp-3', 'udshuddssahduahsd', 1, '61133721321879127', '2020-08-18', '0000-00-00', '0000-00-00'),
(5, 'kp-4', 'udshuddssahduahsd', 1, '61133721321879127', '2020-08-18', '0000-00-00', '0000-00-00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `lab`
--

CREATE TABLE `lab` (
  `id_lab` int(11) NOT NULL,
  `nama_lab` varchar(17) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `lab`
--

INSERT INTO `lab` (`id_lab`, `nama_lab`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Lab Update89', '2020-08-13', '2020-08-13', '0000-00-00'),
(2, 'Lab 2', '2020-08-13', '0000-00-00', '0000-00-00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mapel`
--

CREATE TABLE `mapel` (
  `id_mapel` int(11) NOT NULL,
  `nama_mapel` varchar(17) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mapel`
--

INSERT INTO `mapel` (`id_mapel`, `nama_mapel`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Sastra Mesir', '2020-08-18', '0000-00-00', '0000-00-00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `siswa`
--

CREATE TABLE `siswa` (
  `nis` varchar(11) NOT NULL,
  `id_kelas` int(11) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `jenis_kelamin` enum('laki-laki','perempuan','','') NOT NULL,
  `ttl` varchar(25) NOT NULL,
  `alamat` varchar(25) NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `email` varchar(25) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `id_komputer` int(11) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `siswa`
--

INSERT INTO `siswa` (`nis`, `id_kelas`, `nama`, `jenis_kelamin`, `ttl`, `alamat`, `no_telepon`, `email`, `username`, `password`, `id_komputer`, `created_at`, `updated_at`, `deleted_at`) VALUES
('10293923', 1, 'Raden', 'perempuan', 'Liverpool,20-09-1', 'Abbey Road no.90', '911', 'radenkece911@gmail.com', 'raden911', '12345', 1, '2020-08-14', '0000-00-00', '0000-00-00'),
('2312412313', 1, 'oewe2ndm', 'laki-laki', 'los banwwng,44-22-2009', 'kinshe no.442', 'oewe2ndm', 'fasfswe2327@yahoo.com ', '0kjwekjwaya', 'lupa12323', 1, '2020-08-18', '0000-00-00', '0000-00-00'),
('3223327', 1, 'owuendm', 'perempuan', 'los banwwng,44-02-2009', 'kinshe no.442', 'owuendm', 'fasfswewm7@yahoo.com ', '0kjwekjwaya', 'lupa12323', 1, '2020-08-18', '0000-00-00', '0000-00-00'),
('983187', 2, 'Charles Untung', 'laki-laki', 'los Angles,30-02-2009', 'Cibiru no.42', '087163621', '007@yahoo.com', '007saya', 'yuhghj123', 2, '2020-08-14', '2020-08-14', '0000-00-00'),
('98923', 1, 'ohdshsndm', 'perempuan', 'los banwwng,44-02-2009', 'kinshe no.442', 'ohdshsndm', 'fasfswewm7@yahoo.com ', '0kjwekjwaya', 'lupa12323', 1, '2020-08-18', '0000-00-00', '0000-00-00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tugas`
--

CREATE TABLE `tugas` (
  `id_tugas` int(11) NOT NULL,
  `id_jadwal_mapel` int(11) NOT NULL,
  `title` varchar(150) NOT NULL,
  `desciption` varchar(255) NOT NULL,
  `due_date` date NOT NULL,
  `status` varchar(25) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tugas`
--

INSERT INTO `tugas` (`id_tugas`, `id_jadwal_mapel`, `title`, `desciption`, `due_date`, `status`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 8, 'Abjad dan huruf dlm bahasa mesir', 'ahvguowgoihojewhjjajggasihaknknakhdfkhakmabmbamnbjajgjfakjhkakjlkakjljflajfhiyqiyuqiwloiahsjksabjkhsgfihisjaljsldakpifs0eufwligfksdhgyudyioshknlljaouiqywigjehjqwhdipufoepwquopwopjfkhdsjhduiyi0aysifsnksajaiquwipuqwopjkhfqkwrhuoieoiewqyopewewljekhewlkhfqewo', '2020-09-08', 'Not Done', '2020-09-04', '0000-00-00', '0000-00-00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `work`
--

CREATE TABLE `work` (
  `id_work` int(11) NOT NULL,
  `nis` varchar(11) NOT NULL,
  `id_tugas` int(11) NOT NULL,
  `status` varchar(25) NOT NULL,
  `created_at` date NOT NULL,
  `updated_at` date NOT NULL,
  `deleted_at` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `work`
--

INSERT INTO `work` (`id_work`, `nis`, `id_tugas`, `status`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, '98923', 1, 'Not Done', '2020-09-04', '0000-00-00', '0000-00-00'),
(2, '10293923', 1, 'Not Done', '2020-09-04', '0000-00-00', '0000-00-00');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `attachment_tugas`
--
ALTER TABLE `attachment_tugas`
  ADD PRIMARY KEY (`id_attachment`),
  ADD KEY `id_tugas` (`id_tugas`);

--
-- Indeks untuk tabel `attachment_work`
--
ALTER TABLE `attachment_work`
  ADD PRIMARY KEY (`id_attachment_work`),
  ADD KEY `id_work` (`id_work`);

--
-- Indeks untuk tabel `billing`
--
ALTER TABLE `billing`
  ADD PRIMARY KEY (`id_billing`),
  ADD KEY `id_mapel` (`id_mapel`),
  ADD KEY `id_guru` (`id_guru`),
  ADD KEY `id_komputer` (`id_komputer`),
  ADD KEY `nis` (`nis`);

--
-- Indeks untuk tabel `guru`
--
ALTER TABLE `guru`
  ADD PRIMARY KEY (`id_guru`);

--
-- Indeks untuk tabel `hari`
--
ALTER TABLE `hari`
  ADD PRIMARY KEY (`id_hari`),
  ADD KEY `id_lab` (`id_lab`);

--
-- Indeks untuk tabel `jadwal_lab`
--
ALTER TABLE `jadwal_lab`
  ADD PRIMARY KEY (`id_jadwal_lab`),
  ADD KEY `id_kelas` (`id_kelas`),
  ADD KEY `id_hari` (`id_hari`);

--
-- Indeks untuk tabel `jadwal_mapel`
--
ALTER TABLE `jadwal_mapel`
  ADD PRIMARY KEY (`id_jadwal_mapel`),
  ADD KEY `id_kelas` (`id_kelas`),
  ADD KEY `id_jadwal_lab` (`id_jadwal_lab`),
  ADD KEY `id_mapel` (`id_mapel`),
  ADD KEY `id_guru` (`id_guru`);

--
-- Indeks untuk tabel `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`id_kelas`);

--
-- Indeks untuk tabel `komputer`
--
ALTER TABLE `komputer`
  ADD PRIMARY KEY (`id_komputer`),
  ADD KEY `id_lab` (`id_lab`);

--
-- Indeks untuk tabel `lab`
--
ALTER TABLE `lab`
  ADD PRIMARY KEY (`id_lab`);

--
-- Indeks untuk tabel `mapel`
--
ALTER TABLE `mapel`
  ADD PRIMARY KEY (`id_mapel`);

--
-- Indeks untuk tabel `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`nis`),
  ADD KEY `id_kelas` (`id_kelas`),
  ADD KEY `id_komputer` (`id_komputer`);

--
-- Indeks untuk tabel `tugas`
--
ALTER TABLE `tugas`
  ADD PRIMARY KEY (`id_tugas`),
  ADD KEY `id_jadwal_mapel` (`id_jadwal_mapel`);

--
-- Indeks untuk tabel `work`
--
ALTER TABLE `work`
  ADD PRIMARY KEY (`id_work`),
  ADD KEY `nis` (`nis`),
  ADD KEY `id_tugas` (`id_tugas`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT untuk tabel `attachment_tugas`
--
ALTER TABLE `attachment_tugas`
  MODIFY `id_attachment` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `attachment_work`
--
ALTER TABLE `attachment_work`
  MODIFY `id_attachment_work` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `billing`
--
ALTER TABLE `billing`
  MODIFY `id_billing` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `guru`
--
ALTER TABLE `guru`
  MODIFY `id_guru` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `hari`
--
ALTER TABLE `hari`
  MODIFY `id_hari` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `jadwal_lab`
--
ALTER TABLE `jadwal_lab`
  MODIFY `id_jadwal_lab` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `jadwal_mapel`
--
ALTER TABLE `jadwal_mapel`
  MODIFY `id_jadwal_mapel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `kelas`
--
ALTER TABLE `kelas`
  MODIFY `id_kelas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `komputer`
--
ALTER TABLE `komputer`
  MODIFY `id_komputer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `lab`
--
ALTER TABLE `lab`
  MODIFY `id_lab` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `mapel`
--
ALTER TABLE `mapel`
  MODIFY `id_mapel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `tugas`
--
ALTER TABLE `tugas`
  MODIFY `id_tugas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `work`
--
ALTER TABLE `work`
  MODIFY `id_work` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `attachment_tugas`
--
ALTER TABLE `attachment_tugas`
  ADD CONSTRAINT `attachment_tugas_ibfk_1` FOREIGN KEY (`id_tugas`) REFERENCES `tugas` (`id_tugas`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `attachment_work`
--
ALTER TABLE `attachment_work`
  ADD CONSTRAINT `attachment_work_ibfk_1` FOREIGN KEY (`id_work`) REFERENCES `work` (`id_work`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `billing`
--
ALTER TABLE `billing`
  ADD CONSTRAINT `billing_ibfk_1` FOREIGN KEY (`nis`) REFERENCES `siswa` (`nis`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `billing_ibfk_3` FOREIGN KEY (`id_mapel`) REFERENCES `mapel` (`id_mapel`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `billing_ibfk_4` FOREIGN KEY (`id_komputer`) REFERENCES `komputer` (`id_komputer`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `billing_ibfk_5` FOREIGN KEY (`id_guru`) REFERENCES `guru` (`id_guru`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `hari`
--
ALTER TABLE `hari`
  ADD CONSTRAINT `hari_ibfk_1` FOREIGN KEY (`id_lab`) REFERENCES `lab` (`id_lab`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `jadwal_lab`
--
ALTER TABLE `jadwal_lab`
  ADD CONSTRAINT `jadwal_lab_ibfk_1` FOREIGN KEY (`id_hari`) REFERENCES `hari` (`id_hari`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `jadwal_lab_ibfk_2` FOREIGN KEY (`id_kelas`) REFERENCES `kelas` (`id_kelas`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `jadwal_mapel`
--
ALTER TABLE `jadwal_mapel`
  ADD CONSTRAINT `jadwal_mapel_ibfk_1` FOREIGN KEY (`id_kelas`) REFERENCES `kelas` (`id_kelas`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `jadwal_mapel_ibfk_2` FOREIGN KEY (`id_jadwal_lab`) REFERENCES `jadwal_lab` (`id_jadwal_lab`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `jadwal_mapel_ibfk_3` FOREIGN KEY (`id_mapel`) REFERENCES `mapel` (`id_mapel`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `jadwal_mapel_ibfk_4` FOREIGN KEY (`id_guru`) REFERENCES `guru` (`id_guru`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `komputer`
--
ALTER TABLE `komputer`
  ADD CONSTRAINT `komputer_ibfk_1` FOREIGN KEY (`id_lab`) REFERENCES `lab` (`id_lab`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `siswa`
--
ALTER TABLE `siswa`
  ADD CONSTRAINT `siswa_ibfk_1` FOREIGN KEY (`id_kelas`) REFERENCES `kelas` (`id_kelas`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `siswa_ibfk_2` FOREIGN KEY (`id_komputer`) REFERENCES `komputer` (`id_komputer`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `tugas`
--
ALTER TABLE `tugas`
  ADD CONSTRAINT `tugas_ibfk_1` FOREIGN KEY (`id_jadwal_mapel`) REFERENCES `jadwal_mapel` (`id_jadwal_mapel`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `work`
--
ALTER TABLE `work`
  ADD CONSTRAINT `work_ibfk_1` FOREIGN KEY (`nis`) REFERENCES `siswa` (`nis`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `work_ibfk_2` FOREIGN KEY (`id_tugas`) REFERENCES `tugas` (`id_tugas`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
