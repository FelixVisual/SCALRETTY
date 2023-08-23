 @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {

        if (event.getName().equals("gute-nacht")) {

            event.reply("`\uD83C\uDF19` × " + event.getMember().getAsMention() + " wünscht dem **Server** eine **Gute Nacht**!").queue();

        }

        if (event.getName().equals("guten-morgen")) {

            event.reply("`\uD83C\uDF05` × " + event.getMember().getAsMention() + " wünscht dem **Server** einen **Guten Morgen**!").queue();

        }

        if (event.getName().equals("random-buchstabe")) {

            String[] string1 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
            event.reply("`\uD83C\uDD70\uFE0F` × Der **Random-Buchstabe** ist `" + (string1[new Random().nextInt(string1.length)]) + "`!").queue();
        }

        if (event.getName().equals("kopf-zahl")) {

            String[] string2 = {"Kopf", "Zahl"};
            event.reply("`\uD83D\uDC5B` × Wurf! Die **Münze** ist auf `" + (string2[new Random().nextInt(string2.length)]) + "` gelandet!").queue();

        }


        if (event.getName().equals("zitat-des-monats")) {

            event.reply("`\uD83D\uDCAE` × Das **Zitat des Monats** lautet: Was **dein Feind nicht wissen** soll, das sage **deinem Freunde** nicht. ~Arthur Schopenhauer").queue();

        }

        if (event.getName().equals("color-generator")) {

            Random random = new Random();
            event.reply("`\uD83C\uDFA8` × Die **Random-Farbe** als Hexcode ist: `" + String.format("#%06x", random.nextInt(256*256*256)) + "`").setEphemeral(true).queue();

        }

        if (event.getName().equals("username-generator")) {

            Faker faker = new Faker();
            event.reply("`\uD83D\uDC64` × Der **Random-Username** lautet: `" + faker.superhero().prefix()+faker.name().firstName()+faker.address().buildingNumber() + "`").setEphemeral(true).queue();

        }

    }
