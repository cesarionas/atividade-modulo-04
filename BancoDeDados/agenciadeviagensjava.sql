USE [master]
GO
/****** Object:  Database [AgenciaDeViagens]    Script Date: 05/02/2022 21:40:03 ******/
CREATE DATABASE [AgenciaDeViagens]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'AgenciaDeViagens', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVERDEV2019\MSSQL\DATA\AgenciaDeViagens.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'AgenciaDeViagens_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVERDEV2019\MSSQL\DATA\AgenciaDeViagens_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [AgenciaDeViagens] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [AgenciaDeViagens].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [AgenciaDeViagens] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET ARITHABORT OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [AgenciaDeViagens] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [AgenciaDeViagens] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET  ENABLE_BROKER 
GO
ALTER DATABASE [AgenciaDeViagens] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [AgenciaDeViagens] SET READ_COMMITTED_SNAPSHOT ON 
GO
ALTER DATABASE [AgenciaDeViagens] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET RECOVERY FULL 
GO
ALTER DATABASE [AgenciaDeViagens] SET  MULTI_USER 
GO
ALTER DATABASE [AgenciaDeViagens] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [AgenciaDeViagens] SET DB_CHAINING OFF 
GO
ALTER DATABASE [AgenciaDeViagens] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [AgenciaDeViagens] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [AgenciaDeViagens] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [AgenciaDeViagens] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'AgenciaDeViagens', N'ON'
GO
ALTER DATABASE [AgenciaDeViagens] SET QUERY_STORE = OFF
GO
USE [AgenciaDeViagens]
GO
/****** Object:  Table [dbo].[__EFMigrationsHistory]    Script Date: 05/02/2022 21:40:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[__EFMigrationsHistory](
	[MigrationId] [nvarchar](150) NOT NULL,
	[ProductVersion] [nvarchar](32) NOT NULL,
 CONSTRAINT [PK___EFMigrationsHistory] PRIMARY KEY CLUSTERED 
(
	[MigrationId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Agencia]    Script Date: 05/02/2022 21:40:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Agencia](
	[AgenciaID] [int] IDENTITY(1,1) NOT NULL,
	[Passaporte] [nvarchar](max) NOT NULL,
	[PrecoPromo] [nvarchar](max) NOT NULL,
	[ClienteID] [int] NOT NULL,
	[DestinoID] [int] NOT NULL,
 CONSTRAINT [PK_Agencia] PRIMARY KEY CLUSTERED 
(
	[AgenciaID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Cliente]    Script Date: 05/02/2022 21:40:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cliente](
	[ClienteID] [int] IDENTITY(1,1) NOT NULL,
	[Nome] [nvarchar](max) NOT NULL,
	[Telefone] [nvarchar](max) NOT NULL,
	[Endereco] [nvarchar](max) NOT NULL,
	[Cpf] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Cliente] PRIMARY KEY CLUSTERED 
(
	[ClienteID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Destino]    Script Date: 05/02/2022 21:40:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Destino](
	[DestinoID] [int] IDENTITY(1,1) NOT NULL,
	[Pais] [nvarchar](max) NOT NULL,
	[Data] [varchar](max) NOT NULL,
	[Horario] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Destino] PRIMARY KEY CLUSTERED 
(
	[DestinoID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Index [IX_Agencia_ClienteID]    Script Date: 05/02/2022 21:40:03 ******/
CREATE NONCLUSTERED INDEX [IX_Agencia_ClienteID] ON [dbo].[Agencia]
(
	[ClienteID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
/****** Object:  Index [IX_Agencia_DestinoID]    Script Date: 05/02/2022 21:40:03 ******/
CREATE NONCLUSTERED INDEX [IX_Agencia_DestinoID] ON [dbo].[Agencia]
(
	[DestinoID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Agencia]  WITH CHECK ADD  CONSTRAINT [FK_Agencia_Cliente_ClienteID] FOREIGN KEY([ClienteID])
REFERENCES [dbo].[Cliente] ([ClienteID])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Agencia] CHECK CONSTRAINT [FK_Agencia_Cliente_ClienteID]
GO
ALTER TABLE [dbo].[Agencia]  WITH CHECK ADD  CONSTRAINT [FK_Agencia_Destino_DestinoID] FOREIGN KEY([DestinoID])
REFERENCES [dbo].[Destino] ([DestinoID])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Agencia] CHECK CONSTRAINT [FK_Agencia_Destino_DestinoID]
GO
USE [master]
GO
ALTER DATABASE [AgenciaDeViagens] SET  READ_WRITE 
GO
