 String activity = "\uD83E\uDE90 | dem System";

        JDABuilder b = JDABuilder.createDefault("MTE0MzIwODg4Nzk4MjUwMjA1MQ.Gaqvzt.vt7Kue8ModiEcwxs1u19-18AfSjoRZqySTBlV8");
        b.setStatus(OnlineStatus.ONLINE);
        b.setActivity(Activity.playing(activity));

        b.addEventListeners(new funcmds());
        b.addEventListeners(new tempvoice());

        JDA jda = b.build();
        Guild guild = jda.awaitReady().getGuildById("1141021405169856527");
        guild.updateCommands().addCommands(

                Commands.slash("gute-nacht", "\uD83C\uDF19 × Sage dem Server Gute Nacht!"),
                Commands.slash("guten-morgen", "\uD83C\uDF05 × Sage dem Server Guten Morgen!"),
                Commands.slash("random-buchstabe", "\uD83C\uDD70\uFE0F × Lasse dir einen Random Buchstaben ausgeben!"),
                Commands.slash("kopf-zahl", "\uD83D\uDC5B × Kopf oder Zahl? Lass den Bot werfen!"),
                Commands.slash("zitat-des-monats", "\uD83D\uDCAE × Les dir das Zitat des Monats durch!"),
                Commands.slash("color-generator", "\uD83C\uDFA8 × Generiere eine Random Farbe!"),
                Commands.slash("username-generator", "\uD83D\uDC64 × Generiere einen Random Username!")

        ).queue();
