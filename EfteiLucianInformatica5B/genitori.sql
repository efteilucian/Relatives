-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Nov 23, 2022 alle 14:55
-- Versione del server: 10.4.24-MariaDB
-- Versione PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `efteilucian`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `genitori`
--

CREATE TABLE `genitori` (
  `cognome` varchar(20) DEFAULT NULL,
  `nome` varchar(20) DEFAULT NULL,
  `luogoDiNascita` varchar(20) DEFAULT NULL,
  `gradoDiParentela` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `genitori`
--

INSERT INTO `genitori` (`cognome`, `nome`, `luogoDiNascita`, `gradoDiParentela`) VALUES
('Paiola', 'Giovanni', 'China', 'Cugino\r'),
('Mikeox', 'Long', 'USA', 'Figlio\r'),
('Finatti', 'Marco', 'Italia', 'Fratello\r'),
('Meta', 'Andreea', 'Nigeria', 'Madre\r');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
