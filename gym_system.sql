-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 20, 2023 at 11:53 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gym_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `coaches`
--

CREATE TABLE `coaches` (
  `coach_id` INTEGER auto_increment primary key ,
  `coach_name` text NOT NULL,
  `coach_mobile` int(11) NOT NULL,
  `coach_username` text NOT NULL,
  `coach_password` text NOT NULL,
  `coach_address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `coaches`
--

INSERT INTO `coaches` (`coach_name`, `coach_mobile`, `coach_username`, `coach_password`, `coach_address`) VALUES
('LAMI', 1233, 'KVN_LOVE', 'LOVE00', 'dhsuiwe');

-- --------------------------------------------------------

--
-- Table structure for table `gyms`
--

CREATE TABLE `gyms` (
  `gym_name` text NOT NULL,
  `gym_type` text NOT NULL,
  `gym_info` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `member_id` INTEGER auto_increment primary key ,
  `member_name` text NOT NULL,
  `member_username` text NOT NULL,
  `member_mobile` text NOT NULL,
  `member_password` text NOT NULL,
  `member_address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`member_name`, `member_username`, `member_mobile`, `member_password`, `member_address`) VALUES
('lami', 'lami123', '098767', '1234', 'qwerty');

-- --------------------------------------------------------

--
-- Table structure for table `packages`
--

CREATE TABLE `packages` (
  `package_id` text NOT NULL,
  `package_name` text NOT NULL,
  `package_amount` int(11) NOT NULL,
  `package_total` int(11) NOT NULL,
  `package_info` text NOT NULL,
  `package_type` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Admin`
--

CREATE TABLE `Admin` (
  `admin_Id` INTEGER auto_increment primary key ,
  `name` text NOT NULL,
  `userName` text NOT NULL,
  `password` text NOT NULL,
  `mobile` text NOT NULL,
  `address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


--
-- Dumping data for table `Admin`
--

INSERT INTO `Admin` (`name`,`userName`, `password`, `mobile`, `address`) VALUES
('MyName','admin', 'admin123', '1234', 'qwerty');

--
-- Table structure for table `AssignedCoaches`
--

CREATE TABLE `AssignedCoaches` (
  `coach_id` text NOT NULL,
  `member_id` text NOT NULL,
  `member_name` text NOT NULL,
  `member_username` text NOT NULL,
  `member_mobile` text NOT NULL,
  `member_address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


--
-- Dumping data for table `AssignedCoaches`
--

INSERT INTO `AssignedCoaches` (`coach_id`,`member_id`, `member_name`, `member_username`, `member_mobile`, `member_address`) VALUES
('1','1', 'lami', 'lami123', '098767', 'qwerty');


--
-- Table structure for table `Payment`
--

CREATE TABLE `Payment` (
  `payment_id` INTEGER auto_increment primary key ,
  `member_id` text NOT NULL,
  `package_id` text NOT NULL,
  `package_amount` text NOT NULL,
  `package_info` text NOT NULL,
  `payment_date` text NOT NULL,
  `status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
