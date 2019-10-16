CREATE SCHEMA produto;
GO

CREATE SCHEMA usuario;
GO

CREATE TABLE [usuario].[usuario](
	[id_user] [int] IDENTITY(1,1) NOT NULL,
	[idade] [int] NULL,
	[nome] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_user] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

CREATE TABLE [produto].[produto](
	[id_produto] [int] NOT NULL,
	[categoria] [varchar](255) NULL,
	[nome] [varchar](255) NULL,
	[id_user] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_produto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY];
GO

ALTER TABLE [produto].[produto]  WITH CHECK ADD  CONSTRAINT [FKmk96syje40n7mkgphmjf7o9to] FOREIGN KEY([id_user])
REFERENCES [usuario].[usuario] ([id_user]);
GO

ALTER TABLE [produto].[produto] CHECK CONSTRAINT [FKmk96syje40n7mkgphmjf7o9to];