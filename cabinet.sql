-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2023 at 09:40 AM
-- Server version: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cabinet`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `code` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `mdp` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`code`, `nom`, `mdp`) VALUES
(1, 'alla', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `code` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `telephone` varchar(10) NOT NULL,
  `adresse` varchar(30) NOT NULL,
  `date` varchar(11) NOT NULL,
  `sexe` varchar(10) NOT NULL,
  `alergie` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`code`, `nom`, `telephone`, `adresse`, `date`, `sexe`, `alergie`) VALUES
(24, 'OSAMMA', '06654587', 'HAROCHE', '11/04/2000', 'HOMME', 'ZODRA'),
(25, 'RAOUF', '5555555', ' DJAMEL', '09/09/2002', 'HOMME', 'ZODRA'),
(26, 'ALA', '111313311', 'FGFGFGFGF', '11/72/2458', 'HOMME', 'FGFFGF'),
(27, 'ALLA', '11111111', 'BJHHSAS22222H', '2323', 'HOMME', 'HHHHHHHH');

-- --------------------------------------------------------

--
-- Table structure for table `prescription`
--

CREATE TABLE `prescription` (
  `code` int(11) NOT NULL,
  `patient` varchar(30) NOT NULL,
  `alergie` varchar(30) NOT NULL,
  `traitement` varchar(30) NOT NULL,
  `medicament` varchar(50) NOT NULL,
  `prix` int(30) NOT NULL,
  `dose` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prescription`
--

INSERT INTO `prescription` (`code`, `patient`, `alergie`, `traitement`, `medicament`, `prix`, `dose`) VALUES
(1, 'HOCINE', 'AXSEMA', 'HOCINE', 'PARACITAMOL', 2000, '200ML'),
(2, 'HOCINE', 'AXSEMA', 'HOCINE', 'PARACITAMOL', 2000, '200ML'),
(3, 'ALLA', 'LUNETTE', 'HOCINE', 'PARACITAMOL', 2000, '200ML'),
(4, 'ALLLA', 'SDSDSDSDZ', 'HOCINE', 'PARACITAMOL', 2000, '200ML'),
(5, 'OSAMMA', 'ZODRA', 'HOCINE', 'PARACITAMOL', 2000, '200ML');

-- --------------------------------------------------------

--
-- Table structure for table `rendez`
--

CREATE TABLE `rendez` (
  `code` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `alergie` varchar(30) NOT NULL,
  `heure` varchar(30) NOT NULL,
  `date` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rendez`
--

INSERT INTO `rendez` (`code`, `nom`, `alergie`, `heure`, `date`) VALUES
(9, 'AYOUB', 'ZODRA', '08H', '14/05/2023'),
(8, 'HOCINE', 'AXSEMA', '11H', '13/05/2023'),
(10, 'ALLA', 'LUNETTE', '09H', '15/05/2023');

-- --------------------------------------------------------

--
-- Table structure for table `traitement`
--

CREATE TABLE `traitement` (
  `code` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prix` int(30) NOT NULL,
  `dose` varchar(30) NOT NULL,
  `medicament` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `traitement`
--

INSERT INTO `traitement` (`code`, `nom`, `prix`, `dose`, `medicament`) VALUES
(11, 'HOCINE', 2000, '200ML', 'PARACITAMOL');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `prescription`
--
ALTER TABLE `prescription`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `rendez`
--
ALTER TABLE `rendez`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `traitement`
--
ALTER TABLE `traitement`
  ADD PRIMARY KEY (`code`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
--
-- AUTO_INCREMENT for table `prescription`
--
ALTER TABLE `prescription`
  MODIFY `code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `rendez`
--
ALTER TABLE `rendez`
  MODIFY `code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `traitement`
--
ALTER TABLE `traitement`
  MODIFY `code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
