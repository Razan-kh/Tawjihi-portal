-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 04, 2023 at 07:19 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tawjihi`
--

-- --------------------------------------------------------

--
-- Table structure for table `authorized`
--

CREATE TABLE `authorized` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `authorized`
--

INSERT INTO `authorized` (`username`, `password`) VALUES
('Hadeel', '000000'),
('Razan', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `name` varchar(50) NOT NULL,
  `grade` int(50) NOT NULL,
  `city` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`name`, `grade`, `city`) VALUES
('ahmad', 90, 'Nablus'),
('Haya', 80, 'Nablus'),
('Hala', 75, 'Jenin'),
('manal', 99, 'Ramallah'),
('roba', 20, 'Nablus'),
('Deena', 23, 'Ramallah'),
('doha', 60, 'Jerusalem'),
('Dana', 30, 'Hebron'),
('Dana', 30, 'Hebron'),
('Dana1', 30, 'Hebron'),
('Dana1', 30, 'Hebron'),
('Dana2', 30, 'Hebron'),
('Dana3', 30, 'Hebron'),
('Dana3', 30, 'Hebron'),
('Dana4', 30, 'Hebron'),
('Dana4', 30, 'Hebron'),
('reena', 60, 'Tulkarm'),
('reena', 60, 'Tulkarm'),
('Suha', 45, 'Tulkarm'),
('Suha', 45, 'Tulkarm'),
('Suha', 45, 'Tulkarm');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `authorized`
--
ALTER TABLE `authorized`
  ADD UNIQUE KEY `username` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
