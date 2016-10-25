-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 25 Octobre 2016 à 11:10
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `ventes`
--

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE IF NOT EXISTS `categorie` (
  `CodeCat` varchar(30) NOT NULL,
  `NomCat` varchar(100) NOT NULL,
  PRIMARY KEY (`CodeCat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `id_user` int(11) NOT NULL,
  `Nom` varchar(30) NOT NULL,
  `Prenom` varchar(30) NOT NULL,
  `DateNais` date NOT NULL,
  `Login` varchar(20) NOT NULL,
  `Pwd` varchar(20) NOT NULL,
  `QuestSec` varchar(30) NOT NULL,
  `PointUser` int(11) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `commande`
--

CREATE TABLE IF NOT EXISTS `commande` (
  `NumCmd` int(11) NOT NULL,
  `DateCmd` date NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`NumCmd`),
  UNIQUE KEY `id_user` (`id_user`),
  KEY `id_user_2` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `lignecmd`
--

CREATE TABLE IF NOT EXISTS `lignecmd` (
  `QteCmd` int(11) NOT NULL,
  `PointTot` int(11) NOT NULL,
  `PrixTot` float NOT NULL,
  `NumCmd` int(11) NOT NULL,
  `NumProd` int(11) NOT NULL,
  PRIMARY KEY (`QteCmd`),
  UNIQUE KEY `NumProd_2` (`NumProd`),
  UNIQUE KEY `NumCmd_2` (`NumCmd`),
  UNIQUE KEY `NumCmd_3` (`NumCmd`),
  KEY `NumCmd` (`NumCmd`),
  KEY `NumProd` (`NumProd`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE IF NOT EXISTS `produit` (
  `NumProd` int(11) NOT NULL,
  `Libelle` varchar(50) NOT NULL,
  `Stock` int(11) NOT NULL,
  `PrixTTC` float NOT NULL,
  `PointProd` int(11) NOT NULL,
  `CodeCat` varchar(30) NOT NULL,
  PRIMARY KEY (`NumProd`),
  KEY `CodeCat_2` (`CodeCat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `commande`
--
ALTER TABLE `commande`
  ADD CONSTRAINT `c4` FOREIGN KEY (`id_user`) REFERENCES `client` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `lignecmd`
--
ALTER TABLE `lignecmd`
  ADD CONSTRAINT `c3` FOREIGN KEY (`NumProd`) REFERENCES `produit` (`NumProd`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `c2` FOREIGN KEY (`NumCmd`) REFERENCES `commande` (`NumCmd`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `produit`
--
ALTER TABLE `produit`
  ADD CONSTRAINT `c1` FOREIGN KEY (`CodeCat`) REFERENCES `categorie` (`CodeCat`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
