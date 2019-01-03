-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 22, 2016 at 04:12 AM
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `scj2303`
--
CREATE DATABASE `scj2303` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `scj2303`;

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE IF NOT EXISTS `booking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(15) NOT NULL,
  `traveldate` date NOT NULL,
  `bookingdate` datetime NOT NULL,
  `destination` varchar(30) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '0 - in process | 1 - approved | 2 - cancelled | 3 - paid | 4 - done',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`id`, `login`, `traveldate`, `bookingdate`, `destination`, `status`) VALUES
(1, 'bond', '2016-11-30', '2016-11-15 09:09:28', 'jakarta', 1),
(2, 'bond', '2016-11-30', '2016-11-15 09:24:23', 'jakarta', 1),
(3, 'bond', '2017-01-31', '2016-11-15 09:32:01', 'jakarta', 1),
(4, 'bond', '2017-04-25', '2016-11-15 11:38:05', 'jakarta', 1),
(5, 'bond', '2016-11-30', '2016-11-15 12:05:20', 'jakarta', 1),
(6, 'bond', '2016-11-30', '2016-11-22 08:31:13', 'jakarta', 0);

-- --------------------------------------------------------

--
-- Table structure for table `destinations`
--

CREATE TABLE IF NOT EXISTS `destinations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `image` varchar(100) NOT NULL DEFAULT 'defaultdestination.png',
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '0 - deactivate | 1 - active',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `destinations`
--

INSERT INTO `destinations` (`id`, `name`, `image`, `status`) VALUES
(1, 'Batam', 'defaultdestination.png', 1);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `matriks` varchar(15) NOT NULL,
  `name` varchar(50) NOT NULL,
  `ic` varchar(15) NOT NULL,
  `age` int(11) NOT NULL,
  `photo` varchar(25) NOT NULL DEFAULT 'default.jpg',
  PRIMARY KEY (`matriks`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`matriks`, `name`, `ic`, `age`, `photo`) VALUES
('1', '1', '1', 1, 'default.jpg'),
('2', '2', '2', 2, 'default.jpg');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
