-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 07, 2016 at 09:45 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `insurnace`
--

-- --------------------------------------------------------

--
-- Table structure for table `area`
--

DROP TABLE IF EXISTS `area`;
CREATE TABLE IF NOT EXISTS `area` (
  `id` bigint(20) NOT NULL,
  `description` text,
  `insertionDate` timestamp NULL DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
CREATE TABLE IF NOT EXISTS `department` (
  `id` bigint(20) NOT NULL,
  `description` text,
  `insertionDate` timestamp NULL DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`id`, `description`, `insertionDate`, `name`) VALUES
(1, 'Software', '2016-11-06 21:00:00', 'Software');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `id` bigint(20) NOT NULL,
  `company` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `firstName` varchar(255) NOT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `imagePath` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) NOT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `team` varchar(255) DEFAULT NULL,
  `department_id` bigint(20) DEFAULT NULL,
  `job_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `company`, `email`, `firstName`, `gender`, `imagePath`, `lastName`, `phone`, `team`, `department_id`, `job_id`) VALUES
(2123, 'hjjhjjhs', 'sdsd', 'sdsddsdd', 'sdgff', NULL, 'ffghfhhgf', NULL, NULL, 1, 1234);

-- --------------------------------------------------------

--
-- Table structure for table `job`
--

DROP TABLE IF EXISTS `job`;
CREATE TABLE IF NOT EXISTS `job` (
  `id` bigint(20) NOT NULL,
  `description` text,
  `insertionDate` timestamp NULL DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `job`
--

INSERT INTO `job` (`id`, `description`, `insertionDate`, `name`) VALUES
(1234, 'ffdfdfdfdfd', '2016-11-06 21:00:00', 'developer');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
CREATE TABLE IF NOT EXISTS `member` (
  `id` bigint(20) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `birthDate` timestamp NULL DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `dependentIdNumber` bigint(20) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `idNumber` bigint(20) DEFAULT NULL,
  `insurClass` varchar(255) DEFAULT NULL,
  `insuranceCompany` varchar(255) DEFAULT NULL,
  `insuranceEffectiveDate` timestamp NULL DEFAULT NULL,
  `insuranceExpiryveDate` timestamp NULL DEFAULT NULL,
  `insurancePolicyNo` varchar(255) DEFAULT NULL,
  `memberName` varchar(255) NOT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `premiumValue` varchar(255) DEFAULT NULL,
  `relation` varchar(255) DEFAULT NULL,
  `department_id` bigint(20) DEFAULT NULL,
  `empId_id` bigint(20) DEFAULT NULL,
  `status_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id`, `age`, `birthDate`, `country`, `dependentIdNumber`, `gender`, `idNumber`, `insurClass`, `insuranceCompany`, `insuranceEffectiveDate`, `insuranceExpiryveDate`, `insurancePolicyNo`, `memberName`, `mobile`, `premiumValue`, `relation`, `department_id`, `empId_id`, `status_id`) VALUES
(1, 34, '1982-06-06 21:00:00', 'Egypt', NULL, 'Male', 241915684, 'A', 'Al zamel', '2016-04-10 21:00:00', '2018-05-17 21:00:00', '123423423', 'Mohamed Samir', '0544524553', '1', NULL, 1, 2123, 1),
(2, 30, '1986-06-06 21:00:00', 'Egypt', NULL, 'Male', 241915554, 'A', 'Al zamel', '2015-04-10 21:00:00', '2017-05-17 21:00:00', '1237773423', 'Mohamed sayed', '05445247773', '1', NULL, 1, 2456, 1);

-- --------------------------------------------------------

--
-- Table structure for table `ministry`
--

DROP TABLE IF EXISTS `ministry`;
CREATE TABLE IF NOT EXISTS `ministry` (
  `id` bigint(20) NOT NULL,
  `description` text,
  `insertionDate` timestamp NULL DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sponsor`
--

DROP TABLE IF EXISTS `sponsor`;
CREATE TABLE IF NOT EXISTS `sponsor` (
  `id` bigint(20) NOT NULL,
  `description` text,
  `insertionDate` timestamp NULL DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `status`
--

DROP TABLE IF EXISTS `status`;
CREATE TABLE IF NOT EXISTS `status` (
  `id` bigint(20) NOT NULL,
  `description` text,
  `insertionDate` timestamp NULL DEFAULT NULL,
  `statusName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `statusName` (`statusName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `status`
--

INSERT INTO `status` (`id`, `description`, `insertionDate`, `statusName`) VALUES
(1, 'adsds', '2016-11-06 21:00:00', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint(20) NOT NULL,
  `creationDate` timestamp NULL DEFAULT NULL,
  `description` text,
  `fullName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `userName` (`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
