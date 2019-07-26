-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 02, 2019 at 01:59 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cc_managment`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_details`
--

CREATE TABLE `admin_details` (
  `username` varchar(22) NOT NULL,
  `password` varchar(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_details`
--

INSERT INTO `admin_details` (`username`, `password`) VALUES
('Administrator', '123123');

-- --------------------------------------------------------

--
-- Table structure for table `club_info`
--

CREATE TABLE `club_info` (
  `Club_Id` int(22) NOT NULL,
  `Club_Name` varchar(22) NOT NULL,
  `Club_Owner` varchar(22) NOT NULL,
  `Reg_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `club_info`
--

INSERT INTO `club_info` (`Club_Id`, `Club_Name`, `Club_Owner`, `Reg_Id`) VALUES
(1, 'Kegalle Cricket Club', 'KS.Murali', 1231);

-- --------------------------------------------------------

--
-- Table structure for table `coach_details`
--

CREATE TABLE `coach_details` (
  `Coach_ID` int(11) NOT NULL,
  `First_Name` varchar(22) NOT NULL,
  `Last_Name` varchar(22) NOT NULL,
  `Coach_Type` varchar(22) NOT NULL,
  `Coach_Role` varchar(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coach_details`
--

INSERT INTO `coach_details` (`Coach_ID`, `First_Name`, `Last_Name`, `Coach_Type`, `Coach_Role`) VALUES
(1, 'Cristiano', 'Neymar', 'Batting Coach', 'Head Coach'),
(2, 'Lional', 'Ronaldo', 'Bowling Coach', 'Head Coach'),
(3, 'Zlatan', 'Mbeppe', 'Fielding Coach', 'Assistant Coach');

-- --------------------------------------------------------

--
-- Table structure for table `member_details`
--

CREATE TABLE `member_details` (
  `Member_ID` int(11) NOT NULL,
  `First_Name` varchar(55) NOT NULL,
  `Last_Name` varchar(55) NOT NULL,
  `District` varchar(55) NOT NULL,
  `DOB` varchar(55) NOT NULL,
  `Gender` varchar(55) NOT NULL,
  `Phone_No` varchar(55) NOT NULL,
  `E_Mail` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member_details`
--

INSERT INTO `member_details` (`Member_ID`, `First_Name`, `Last_Name`, `District`, `DOB`, `Gender`, `Phone_No`, `E_Mail`) VALUES
(1, 'Saajid', 'Muhmmad', 'Kegalle', '1998/02/05', 'Male', '0757283728', 'saajith@yahoo.com'),
(2, 'Ajith', 'Kumar', 'Badulla', '12/12/1997', 'Male', '07512129883', 'ajithkumar@yahoo.com');

-- --------------------------------------------------------

--
-- Table structure for table `player_details`
--

CREATE TABLE `player_details` (
  `Player_ID` int(11) NOT NULL,
  `Full_Name` varchar(55) NOT NULL,
  `Nick_Name` varchar(55) NOT NULL,
  `District` varchar(55) NOT NULL,
  `DOB` varchar(55) NOT NULL,
  `Player_Role` varchar(55) NOT NULL,
  `Batting_Style` varchar(55) NOT NULL,
  `Bowling_Type` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `player_details`
--

INSERT INTO `player_details` (`Player_ID`, `Full_Name`, `Nick_Name`, `District`, `DOB`, `Player_Role`, `Batting_Style`, `Bowling_Type`) VALUES
(1, 'Kumar Sangakkara', 'Sanga', 'Jaffna', '12/12/1990', 'Bowler', 'Right Hand Batting', 'Left Arm Fast'),
(2, 'Dinesh Thirimanne', 'Thiriya', 'Batticaloa', '12/12/1990', 'Batsman', 'Right Hand Batting', 'Left Arm Fast'),
(3, 'Lasith Kulasekea', 'Kulaya', 'Anuradhapura', '12/12/1990', 'Batsman', 'Right Hand Batting', 'Right Arm Fast'),
(4, 'Nuwan Malinga', 'Maly', 'Badulla', '12/12/1980', 'All Rounder', 'Right Hand Batting', 'Left Arm Fast'),
(5, 'Charama Perera', 'Perera', 'Anuradhapura', '12/12/1980', 'Batsman', 'Right Hand Batting', 'Right Arm Fast'),
(6, 'Kusal Dikwella', 'Dikka', 'Anuradhapura', '12/12/1980', 'Bowler', 'Right Hand Batting', 'Right Arm Fast'),
(7, 'Steve Maxwel', 'Maxy', 'Galle', '12/12/1990', 'Bowler', 'Right Hand Batting', 'Right Arm Medium'),
(8, 'George Smith', 'Smithy', 'Colombo', '13/11/1991', 'Wicket Keeper', 'Right Hand Batting', 'Left Arm Fast'),
(9, 'AB de Plessis', 'AB', 'Gampaha', '12/12/1998', 'Batsman', 'Right Hand Batting', 'Left Arm Fast'),
(10, 'Faf du Villers', 'Fafdu', 'Galle', '12/12/1999', 'Bowler', 'Left Hand Batting', 'Right Arm Fast'),
(11, 'Virath Dhoni', 'Dhoni', 'Batticaloa', '12/11/1997', 'Bowler', 'Right Hand Batting', 'Left Arm Fast'),
(12, 'MS Kohli', 'Koliya', 'Ampara', '12/12/1991', 'Bowler', 'Left Hand Batting', 'Left Arm Fast');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_details`
--
ALTER TABLE `admin_details`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `club_info`
--
ALTER TABLE `club_info`
  ADD PRIMARY KEY (`Club_Id`),
  ADD UNIQUE KEY `Club_Id` (`Club_Id`);

--
-- Indexes for table `coach_details`
--
ALTER TABLE `coach_details`
  ADD PRIMARY KEY (`Coach_ID`);

--
-- Indexes for table `member_details`
--
ALTER TABLE `member_details`
  ADD PRIMARY KEY (`Member_ID`);

--
-- Indexes for table `player_details`
--
ALTER TABLE `player_details`
  ADD PRIMARY KEY (`Player_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `coach_details`
--
ALTER TABLE `coach_details`
  MODIFY `Coach_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `member_details`
--
ALTER TABLE `member_details`
  MODIFY `Member_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `player_details`
--
ALTER TABLE `player_details`
  MODIFY `Player_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
