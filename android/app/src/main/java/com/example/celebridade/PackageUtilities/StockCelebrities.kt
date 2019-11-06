package com.example.celebridade.PackageUtilities

import com.example.celebridade.R
import com.example.celebridade.localdatabase.PackageDAO.CelebritiesINFOS
import com.example.celebridade.localdatabase.PackageDAO.celebritiesDAO
import com.example.celebridade.localdatabase.quote.InfoRoom

abstract class StockCelebrities {

    companion object {

        private fun addPlusCelebrities(celebritiesINFOS: CelebritiesINFOS, infoRooms: List<InfoRoom>, celebritiesDAO: celebritiesDAO) {
            celebritiesDAO.add(celebritiesINFOS)
            celebritiesDAO.addInfos(infoRooms)
        }

        private val Hollywood1 = CelebritiesINFOS("Daniel Radcliffe", R.drawable.danielradcliffe, 1)

        private val Info1 = listOf<InfoRoom>(
                InfoRoom(1,"Ator1 - ola meu nom é harry potter "),
                InfoRoom(1,"expecto patronum "),
                InfoRoom(1,"Pode se encontrar a felicidade mesmo nas horas mais sombrias "),
                InfoRoom(1,"Afinal, aquilo que amamos sempre será parte de nós."),
                InfoRoom(1,"Preciso de você agora mais do que nunca "),
                InfoRoom(1,"Não se espante. Você deveria saber que tudo que é bom um dia acaba. "),
                InfoRoom(1,"Aqui jaz Dobby, um elfo livre. "),
                InfoRoom(1,"Não haveria luz se não houvessem trevas. "),
                InfoRoom(1,"Não faça perguntas e não te direi mentiras. "),
                InfoRoom(1,"Sou um bruxo e sei alguns feitiços"),
                InfoRoom(1,"Sonorus "),
                InfoRoom(1,"Reparo "),
                InfoRoom(1,"Portus "),
                InfoRoom(1,"Levicorpus "),
                InfoRoom(1,"Uediósi "),
                InfoRoom(1,"Wingardium Leviosa "),
                InfoRoom(1,"Rictusempra "),
                InfoRoom(1,"Chegou a hora de escolhermos entre o que é certo e o que é fácil. "),
                InfoRoom(1,"Aquilo que perdemos arranja sempre maneira de voltar para nós. "),
                InfoRoom(1,"Ora, o último inimigo a ser aniquilado é a morte. ")
        )

        private val Hollywood2 = CelebritiesINFOS("Brie Larson", R.drawable.brielarson, 2)

        private val Info2 = listOf<InfoRoom>(
                InfoRoom(2,"Ator2 - ola meu nome é capitã marvel "),
                InfoRoom(2,"A guerra é uma linguagem universal. "),
                InfoRoom(2,"Acho que não sou quem você pensa. "),
                InfoRoom(2,"Algo em meu passado é a chave de tudo isso."),
                InfoRoom(2,"A raiva só serve ao inimigo. "),
                InfoRoom(2,"As guerras são maiores do que pensa. "),
                InfoRoom(2,"Controle seus impulsos."),
                InfoRoom(2,"Dizer adeus é sempre difícil "),
                InfoRoom(2,"Esse é só o começo. Existe milhões de nós separados uns dos outros "),
                InfoRoom(2,"Eu conheço um soldado desgarrado quando o vejo"),
                InfoRoom(2,"Thanos ficou de boca aberta quando me Viu"),
                InfoRoom(2,"Sou cantora além de atriz "),
                InfoRoom(2,"tenho Oscar de melhor atriz"),
                InfoRoom(2,"nasci em sacramento no estado da california "),
                InfoRoom(2,"Adoro  a franquia star wars"),
                InfoRoom(2,"Adoro os vingadores "),
                InfoRoom(2,"Sou fascinada por fungos "),
                InfoRoom(2,"estive em de repente 30 e ninguem lembra  "),
                InfoRoom(2,"gosto do homem aranha, bom amigo "),
                InfoRoom(2,"Sou uma popstar da musica! ")
        )

        private val Hollywood3 = CelebritiesINFOS("Rami Malek", R.drawable.ramimalek, 3)

        private val Info3 = listOf<InfoRoom>(
                InfoRoom(3,"Ator3 - ola meu nome é freddie mercury "),
                InfoRoom(3,"Adoro hackear "),
                InfoRoom(3,"Mr.Robot Vibes "),
                InfoRoom(3,"ja estive em um game "),
                InfoRoom(3,"bohemian rhapsody é otimo "),
                InfoRoom(3,"tenho um irmão gemeo professor "),
                InfoRoom(3,"prefiro o anonimato do que fama "),
                InfoRoom(3,"sou paranoico"),
                InfoRoom(3,"nasci em los angeles"),
                InfoRoom(3,"coloquei proteses para interpretar freddie mercury "),
                InfoRoom(3,"adoro fazer amizade com meus companheiros de camera"),
                InfoRoom(3,"hot-dog é minha comida favorita "),
                InfoRoom(3,"gosto muito de rock "),
                InfoRoom(3,"gravar bohemian deu muito trabalho "),
                InfoRoom(3,"tive dificuldade para me tornar ator "),
                InfoRoom(3,"ja estive em need for speed "),
                InfoRoom(3,"meuhobby preferido é jogar video game"),
                InfoRoom(3,"ja fui indicado ao oscar "),
                InfoRoom(3,"sou caseiro"),
                InfoRoom(3,"não gosto muito de festas ")
        )

        private val Hollywood4 = CelebritiesINFOS("TomHolland", R.drawable.tomholland, 4)

        private val Info4 = listOf<InfoRoom>(
                InfoRoom(4,"Ator4 - ola meu nome é homem aranha "),
                InfoRoom(4,"pode me chamar de amigão da vizinhança "),
                InfoRoom(4,"meu segundo filme faturo mais de 1 bilhão "),
                InfoRoom(4,"capitã marvel é bonita "),
                InfoRoom(4,"sou mais forte que o venom "),
                InfoRoom(4,"queria ferias namoral "),
                InfoRoom(4,"sou um vingador "),
                InfoRoom(4,"Será que sou digno? "),
                InfoRoom(4,"mysterio é uma pessoa horrivel "),
                InfoRoom(4,"com grandes poderes... vem o que mesmo? "),
                InfoRoom(4,"tenho muitas responsabilidades "),
                InfoRoom(4,"sr strk faz falta"),
                InfoRoom(4,"aranha de ferro é otimo"),
                InfoRoom(4,"CADE A MJ "),
                InfoRoom(4,"ja fiz outros filmes também "),
                InfoRoom(4,"queria trabalhar com o hugh jackman "),
                InfoRoom(4,"tenho 1,73 m "),
                InfoRoom(4,"tenho apenas 23 anos "),
                InfoRoom(4,"chegou a nova onda do aranha pra ficar "),
                InfoRoom(4,"Marvel X DC, prefiro a marvel")
        )

        private val Hollywood5 = CelebritiesINFOS("scarlet jonhason", R.drawable.scarletjonhason, 5)

        private val Info5 = listOf<InfoRoom>(
                InfoRoom(5,"Ator5 - ola meu nome é viuva negra "),
                InfoRoom(5,"Regimes caem todos os dias. Tento não chorar por isso, eu sou russa, ou eu era "),
                InfoRoom(5,"Não disse que deveríamos ir embora. Há formas piores de morrer. Onde mais conseguiria uma vista assim? "),
                InfoRoom(5,"A verdade é circunstancial, não é tudo igual para todas as pessoas o tempo todo. Eu também não sou "),
                InfoRoom(5,"Não queremos matá-los. Mas nós vamos "),
                InfoRoom(5,"Só porque é o caminho de menor esforço não significa que seja o caminho errado. "),
                InfoRoom(5,"Eu faria o que eu quisesse fazer. Com quem eu tivesse vontade"),
                InfoRoom(5,"Eu sonhei que eu era uma Vingadora. "),
                InfoRoom(5,"não estamos sozinhos  "),
                InfoRoom(5,"não posso ter filhos "),
                InfoRoom(5,"fui uma espiã de verdade "),
                InfoRoom(5,"faço tudo por aqueles que amo "),
                InfoRoom(5,"eu sou mais importante que uma joia "),
                InfoRoom(5,"tenho bastões eletricos "),
                InfoRoom(5,"não gosto da capitã marvel "),
                InfoRoom(5,"tenho 34 anos "),
                InfoRoom(5,"nasci em novembro "),
                InfoRoom(5,"também sou cantora "),
                InfoRoom(5,"meu contrato com a marvel ta acabando "),
                InfoRoom(5,"nasci em manhatan ")
        )

        private val Hollywood6 = CelebritiesINFOS("Michale Fassbender", R.drawable.michaelfassbender, 6)

        private val Info6 = listOf<InfoRoom>(
                InfoRoom(6,"Ator6 - ola meu nome é Magneto "),
                InfoRoom(6,"não gosto dos x-mens "),
                InfoRoom(6,"o fator de cura do logan é interessante "),
                InfoRoom(6,"posso controlar tudo que for de metal "),
                InfoRoom(6,"posso fazr muito mais do que voce imagina "),
                InfoRoom(6,"Mercurio é meu filho "),
                InfoRoom(6,"feiticeira scarlate é minha filha "),
                InfoRoom(6,"ja tive um caso com a mistica "),
                InfoRoom(6,"gosto de ser fazendeiro "),
                InfoRoom(6,"meu hobby preferido é maratonar series "),
                InfoRoom(6,"fiz assasins creed "),
                InfoRoom(6,"tenho uma tatuagem secreta"),
                InfoRoom(6,"sou aleão mas fui criado na irlanda "),
                InfoRoom(6,"tenho 1,83 m"),
                InfoRoom(6,"tenho dois filhos "),
                InfoRoom(6,"um futuro incerto me aguarda "),
                InfoRoom(6,"detesto a cura para os mutantes "),
                InfoRoom(6,"uso um capacete para evitar problemas mentais "),
                InfoRoom(6,"Ator6 - charles é meu melhor amigo "),
                InfoRoom(6,"Ator6 - tenho 42 anos ")
        )

        private val Hollywood7 = CelebritiesINFOS("Miranda Cosgrove", R.drawable.mirandacosgrove, 7)

        private val Info7 = listOf<InfoRoom>(
                InfoRoom(7,"Ator7 - ola meu nome é Carly "),
                InfoRoom(7,"ja fiz um citicon chamada icarly "),
                InfoRoom(7,"1,2,3... Gravando "),
                InfoRoom(7,"A sam n devia estar na cadeia"),
                InfoRoom(7,"meu irmão spancer é muito estranho "),
                InfoRoom(7," eu não gosto do fredie"),
                InfoRoom(7,"meu contrato com a nicklodeon venceu "),
                InfoRoom(7,"sou cantora e compositora "),
                InfoRoom(7,"Gosto de fazer cupcakes de madrugada"),
                InfoRoom(7,"Meu filme favorito é Amélie Poulain "),
                InfoRoom(7," Eu coleciono bicicletas"),
                InfoRoom(7,"Eu já fiz uma festa de aniversário para meu gato"),
                InfoRoom(7," Eu conheci todos os presidentes americanos que estão vivos "),
                InfoRoom(7,"Freaks and Geeks é a minha série de TV favorita "),
                InfoRoom(7,"AGosto de desenhar e pintar"),
                InfoRoom(7,"Sou excelente na arte de procrastinar "),
                InfoRoom(7,"Eu amo ler "),
                InfoRoom(7,"Não fico mais de uma semana sem comer sushi"),
                InfoRoom(7,"Adoro nadar na chuva! "),
                InfoRoom(7,"tenho 1,68 m ")
        )

        private val Hollywood8 = CelebritiesINFOS("Joaquin Phoenix", R.drawable.joaquinphoenixjoker, 8)

        private val Info8 = listOf<InfoRoom>(
                InfoRoom(8,"Ator8 - ola meu nome é coringa "),
                InfoRoom(8,"adoro uma discordia "),
                InfoRoom(8,"quero ver apenas ver o circo pegar fogo "),
                InfoRoom(8,"tenhoa apenas 1,73 m  "),
                InfoRoom(8,"não cai na maldição do coringa "),
                InfoRoom(8,"tenho um irmão "),
                InfoRoom(8,"heath ledger era meu melhor amigo "),
                InfoRoom(8,"perdi 23 kilos na marra "),
                InfoRoom(8,"estou concorrendo ao oscar novamente "),
                InfoRoom(8,"lembra dos dois caras no hospicio? HAHAHAH, eu matei... "),
                InfoRoom(8,"Ator8 - ola meu nome é coringa "),
                InfoRoom(8,"basta apenas um dia ruim para virar louco "),
                InfoRoom(8,"a sociedade é pessima "),
                InfoRoom(8,"matei um robin, faltam os outros "),
                InfoRoom(8,"porque está tão serio? "),
                InfoRoom(8,"a comedia é subjetiva haha "),
                InfoRoom(8,"eu tive um dia pessimo"),
                InfoRoom(8,"achava que minha vida era uma tragedia, mas na verdade é uma comedia "),
                InfoRoom(8,"minha vida faz mais centavos que minha morte "),
                InfoRoom(8,"preciso do batman para rir ")
        )

        private val Hollywood9 = CelebritiesINFOS("Benedict Cumberbatch", R.drawable.benedictcumberbatch, 9)

        private val Info9 = listOf<InfoRoom>(
                InfoRoom(9,"meu nome é muito estranho"),
                InfoRoom(9,"meu nome significa abençoado "),
                InfoRoom(9,"contracenei com os vingadores "),
                InfoRoom(9,"posso controlar a joia do tempo "),
                InfoRoom(9,"na minha familia a varios atores "),
                InfoRoom(9,"fiz dragão de hobbit "),
                InfoRoom(9,"respeito muito as pessoas "),
                InfoRoom(9,"tenho talento para ser cantor "),
                InfoRoom(9,"sou naturalmente ruivo"),
                InfoRoom(9,"sou feminista! "),
                InfoRoom(9,"me considero "),
                InfoRoom(9,"não gosto do meu cabelo em sherlock "),
                InfoRoom(9,"ja fiz a serie sherlock "),
                InfoRoom(9,"sei tocar violino"),
                InfoRoom(9,"ja tive um stalker bizarro "),
                InfoRoom(9,"desiste de direito para virar ator "),
                InfoRoom(9,"ja participei de vila sesamo "),
                InfoRoom(9,"ja fui vilão em star trak "),
                InfoRoom(9,"não consigo falar pinguin "),
                InfoRoom(9,"posso fazer diversas magias ")
        )

        private val Hollywood10 = CelebritiesINFOS("James Mcvoy", R.drawable.jamesmcvoy, 10)

        private val Info10 = listOf<InfoRoom>(
                InfoRoom(10,"Ator10 - ola meu nome é professor X "),
                InfoRoom(10,"nasci em abril"),
                InfoRoom(10,"meu pai me abandonou "),
                InfoRoom(10,"tenho esposa e filhos "),
                InfoRoom(10,"sou professor e dono da mansão x para jovens mutantes "),
                InfoRoom(10,"eu sei seu passaod logan "),
                InfoRoom(10,"gostaria de contracenar com deadpool "),
                InfoRoom(10,"o ultimo filme dos xmens não teve sucesso "),
                InfoRoom(10,"precisamos derrotaar aquel palhaço "),
                InfoRoom(10,"sou o bill em it a coisa"),
                InfoRoom(10,"tenho mais de 5 personalidades no filme fragmentado "),
                InfoRoom(10,"ja fiz o filme vidro "),
                InfoRoom(10,"ja fiz o filme fragmentado "),
                InfoRoom(10,"gosto muito de sudoku"),
                InfoRoom(10,"ja estive em narnia "),
                InfoRoom(10,"mistica faz parte dos xmens agora "),
                InfoRoom(10,"erik e eu eramos grandes amigos "),
                InfoRoom(10,"o lider dos xmens é scort "),
                InfoRoom(10,"logan é um cara complicado "),
                InfoRoom(10," espero que a jean grey esteja bem")
        )

        private val Hollywood11 = CelebritiesINFOS("Adam Sandler", R.drawable.adamsandler, 11)

        private val quotes11 = listOf<InfoRoom>(
                InfoRoom(11,"ja fiz diversos filmes de comédia "),
                InfoRoom(11,"sou facinado por bolinhos "),
                InfoRoom(11,"meus filmes fazem sucesso no netflix "),
                InfoRoom(11,"ja estou na calçada da fama "),
                InfoRoom(11,"me tornei humorista aos 17 anos "),
                InfoRoom(11,"tenho uma produtora chamada happy madison productions "),
                InfoRoom(11,"ja fui convidado para fazer a fabrica de chocolate "),
                InfoRoom(11,"dublei o dracula em hotel transilvania "),
                InfoRoom(11,"doei 1 milhão de dolares para um grupo crianças na inglaterra "),
                InfoRoom(11,"ja fiz gente grande 1 e 2 "),
                InfoRoom(11,"também sou conhecido como zohan "),
                InfoRoom(11," ja fiz click"),
                InfoRoom(11,"ja ganhei muitas framboesas de ouro, infelizmente "),
                InfoRoom(11,"nasci no Brooklyn "),
                InfoRoom(11,"ja fiz muitas pontas em alguns filmes "),
                InfoRoom(11,"estou fazendo um filme de drama "),
                InfoRoom(11,"meu primeiro filme foi um fracasso total "),
                InfoRoom(11,"tenho 1 filha "),
                InfoRoom(11,"tenho 53 anos "),
                InfoRoom(11,"tenho 1,77 m ")
        )

        private val Hollywood12 = CelebritiesINFOS("Dwayne jonhson", R.drawable.dwaynejohnson, 12)

        private val Info12 = listOf<InfoRoom>(
                InfoRoom(12,"Ator12 - ola meu nome é the Rock "),
                InfoRoom(12,"estou na franquia velozes e furiosos "),
                InfoRoom(12,"vou ser o futuro adão negro "),
                InfoRoom(12,"gosto da DC "),
                InfoRoom(12,"gosto da Marvel "),
                InfoRoom(12,"the rock é um nome ficticio "),
                InfoRoom(12,"ja fui da WWE "),
                InfoRoom(12,"gosto de cachorros "),
                InfoRoom(12,"tenho muito musculo "),
                InfoRoom(12,"ja fiz jumanji "),
                InfoRoom(12,"dou um pau em quem vier "),
                InfoRoom(12,"adoro filmes de dramas "),
                InfoRoom(12,"não gosto de quem se acha o tal "),
                InfoRoom(12," tenho quase 2 metros"),
                InfoRoom(12,"Quem precisa de dieta quando se tem MUSCULOS"),
                InfoRoom(12,"Sem dor Sem ganho "),
                InfoRoom(12,"sou testoterona PURA "),
                InfoRoom(12,"não gosto do vin diesel "),
                InfoRoom(12,"tenho um irmão "),
                InfoRoom(12,"agora estou fazendo filmes pra disney ")
        )
        private val Hollywood13 = CelebritiesINFOS("Jack Black", R.drawable.jackblack, 13)

        private val Info13 = listOf<InfoRoom>(
                InfoRoom(13,"Ator13 - ola meu nome é JB "),
                InfoRoom(13,"tenho uma banda chamada tenacious d "),
                InfoRoom(13,"tenho muitos filmes em eu curriculo "),
                InfoRoom(13," ja fiz muitos filmes de comédia"),
                InfoRoom(13,"ja dei vozes a muitos personagens "),
                InfoRoom(13,"estive recentemente no rock in rio "),
                InfoRoom(13,"nasci na california "),
                InfoRoom(13,"sou muito fã de AC/DC "),
                InfoRoom(13,"um dos filmes famosos meu e escola do rock "),
                InfoRoom(13,"adoro guitar hero "),
                InfoRoom(13,"ja fui prontagonista do game rock legends "),
                InfoRoom(13,"ja fiz as viagens de guliver "),
                InfoRoom(13," tenho dois filmes"),
                InfoRoom(13,"sou campeão de black jack "),
                InfoRoom(13,"ja fiz o remake de goosebumps "),
                InfoRoom(13,"adoro assunto de aliens "),
                InfoRoom(13,"no rock in rio fiz dupla com o brasileiro junior groovador "),
                InfoRoom(13,"ja dei voz a poo no kung fu panda "),
                InfoRoom(13,"sou compositor "),
                InfoRoom(13,"sou cantor ")

        )

        private val Hollywood14 = CelebritiesINFOS("Ryan Reynolds", R.drawable.ryanreynolds, 14)

        private val Info14 = listOf<InfoRoom>(
                InfoRoom(14,"Ator14 - ola meu nome é deadpool "),
                InfoRoom(14,"gosto de falr muito palavrão hehe "),
                InfoRoom(14,"ja fiz dois filmes que não deram certos "),
                InfoRoom(14,"amo unicornios "),
                InfoRoom(14,"adoro o meu personagem deadpool "),
                InfoRoom(14,"ta nahora de umas chimichangas "),
                InfoRoom(14,"AMO ARMAS E ESPADAS, "),
                InfoRoom(14,"levo a roupa dos meus filmes para casa "),
                InfoRoom(14,"adoro uma violencia UI "),
                InfoRoom(14,"gosto de filmes de comedia "),
                InfoRoom(14,"ja fui ator galã "),
                InfoRoom(14,"sou mais alto que o wolverine "),
                InfoRoom(14,"tenho quase 1 metro e noventa, alto pra porr% "),
                InfoRoom(14,"ja tenho 43 anos, to velho hein"),
                InfoRoom(14,"ja falei que posso quebrar a quarta parede?! pois é "),
                InfoRoom(14,"so acho que esse trabalho merece um 10 "),
                InfoRoom(14,"hugh jackman é lindo ! "),
                InfoRoom(14,"marvel me fez renascer como deadpool "),
                InfoRoom(14,"A warner tem que se fud#$ "),
                InfoRoom(14,"DETESTO O LANTERNA VERDE ")
        )

        private val Holywood15 = CelebritiesINFOS("Tobey Maguire", R.drawable.tobeymaguire, 15)

        private val Info15 = listOf<InfoRoom>(
                InfoRoom(15,"Ator15 - ola meu nome é miranha "),
                InfoRoom(15,"fui o primeiro homem aranha a fazer sucesso "),
                InfoRoom(15,"ja fiz diversos filmes fora homem aranha "),
                InfoRoom(15,"não sou muito fã de fotografos "),
                InfoRoom(15,"fui ator mirin "),
                InfoRoom(15,"o terceiro filme do homem aranha não deu muito certo "),
                InfoRoom(15,"ja tive problemas com alcool antes de 18 ano "),
                InfoRoom(15,"adoro jogar poker "),
                InfoRoom(15,"não atuo mais "),
                InfoRoom(15,"agora apenas produzo filmes "),
                InfoRoom(15,"tenho um problema com o estresse "),
                InfoRoom(15,"produzi o dono do jogo "),
                InfoRoom(15,"produzi a 5 onde "),
                InfoRoom(15,"ja fiz rock of ages "),
                InfoRoom(15,"estou um tempo afastado de hollywood "),
                InfoRoom(15,"ja dei minha voz a diversos games do homem aranha "),
                InfoRoom(15,"doutor octaviso foi um grande mestre "),
                InfoRoom(15,"eu não matei norman osborn "),
                InfoRoom(15,"harry osborn é meu melhor amigo "),
                InfoRoom(15,"onde está a mary jane ")
        )

        private val Hollywood16 = CelebritiesINFOS("Will Smith", R.drawable.willsmith, 16)

        private val Info16 = listOf<InfoRoom>(
                InfoRoom(16,"Ator16 - ola meu nome é Will "),
                InfoRoom(16,"sou um maluco no pedaço "),
                InfoRoom(16,"sou cantor de rap! "),
                InfoRoom(16,"sou compositor! "),
                InfoRoom(16,"ja fiz a adptação do livro eu robo "),
                InfoRoom(16,"ja fiz MIB homens de preto "),
                InfoRoom(16,"ja salvei a terra em muitos filmes "),
                InfoRoom(16,"em independence dai invadi uma nave alienigena "),
                InfoRoom(16,"tenho 50 anos "),
                InfoRoom(16,"tenho três irmãos: Pam, Ellen e Harry. "),
                InfoRoom(16,"antes de ser ator, trabalhei instalando geladeira com meu pai "),
                InfoRoom(16,"tenho três filhos: Trey, Willow e Jaden "),
                InfoRoom(16,"saudades do tio Phil "),
                InfoRoom(16,"morei em xangai por 3 meses por conta de meu filho "),
                InfoRoom(16,"brigava muito no colegio "),
                InfoRoom(16,"nunca fiz faculdade "),
                InfoRoom(16,"recusei meu papel em matrix "),
                InfoRoom(16,"nasci na filadélfia "),
                InfoRoom(16,"tenho um filho que é cantor "),
                InfoRoom(16,"ja fiz um super heroi doidão ")

        )

        private val Hollywood17 = CelebritiesINFOS("Mark Zuckberg", R.drawable.markzuckeberg, 17)

        private val Info17 = listOf<InfoRoom>(
                InfoRoom(17,"Ator17 - ola meu nome é FaceBook "),
                InfoRoom(17,"sou o dono do facebook"),
                InfoRoom(17,"sou o dono do instagram "),
                InfoRoom(17,"compre até o whatsapp acredita? por 16 milhoões "),
                InfoRoom(17,"não sou robo "),
                InfoRoom(17,"não sou camaleão "),
                InfoRoom(17,"não sou alienigena "),
                InfoRoom(17,"ja levei varios processos "),
                InfoRoom(17,"eu espiona as pessoas pela webcam "),
                InfoRoom(17,"tenho um banco de dados com todas as informações de pessoas do mundo "),
                InfoRoom(17,"sou flho de uma dentista cm psquiatra "),
                InfoRoom(17,"gosto de programar em C++ "),
                InfoRoom(17,"fui campeão de esgrima no ensino médio "),
                InfoRoom(17,"falo 4 idiomas "),
                InfoRoom(17,"sou designer "),
                InfoRoom(17,"sou empreendedor "),
                InfoRoom(17,"sou daltonico para as cores vermelhas e verde"),
                InfoRoom(17,"adoro cachorros "),
                InfoRoom(17,"gosto de filmes de ficção cientifica "),
                InfoRoom(17,"gosto do livro ender´s game: o jogo do exterminador ")

        )

        private val Hollywood18 = CelebritiesINFOS("Arnold Schwarzenegger", R.drawable.arnoldschwarzenegger, 18)

        private val Info18 = listOf<InfoRoom>(
                InfoRoom(18,"Ator18 - ola meu nome é T-800 "),
                InfoRoom(18,"Hasta la vista baby "),
                InfoRoom(18,"Eu voltei "),
                InfoRoom(18,"A força não vem de vencer "),
                InfoRoom(18,"A pior coisa que eu posso ser é igual a todo mundo "),
                InfoRoom(18,"Pessoas normais são felizes com vidas normais  "),
                InfoRoom(18,"onde esta sarah connor"),
                InfoRoom(18,"onde esta john connor "),
                InfoRoom(18,"Eu tinha a certeza de que poderia ir para a América se vencesse o Mr. Universo."),
                InfoRoom(18,"É mais fácil se destacar quando você mira direto no topo. "),
                InfoRoom(18,"sou um exterminador "),
                InfoRoom(18,"quero apenas salvar a humanidade "),
                InfoRoom(18,"ja fiz mais de 10 filmes "),
                InfoRoom(18,"ja fui fisico turista "),
                InfoRoom(18,"aprendi muita coisa com john connor "),
                InfoRoom(18,"Preciso deter a skynet "),
                InfoRoom(18,"o futuro é uma desgraça "),
                InfoRoom(18,"ja fui politico "),
                InfoRoom(18,"sou um mercenario "),
                InfoRoom(18,"apesar de velho estou em forma ")
        )

        private val Hollywood19 = CelebritiesINFOS("Ariana Grande", R.drawable.arianagrande, 19)

        private val Info19 = listOf<InfoRoom>(

                InfoRoom(19,"Ator19 - ola meu nome é kat "),
                InfoRoom(19,"ja fiz dois seriados com a mesma personagem"),
                InfoRoom(19,"sou vegana "),
                InfoRoom(19,"Adoro Salto Alto "),
                InfoRoom(19,"Adoro cozinhar e jardinagem "),
                InfoRoom(19,"meu jogo favorito é monopoly "),
                InfoRoom(19,"AGosto de dormir com poucas roupas"),
                InfoRoom(19,"sou uma cantora famosa "),
                InfoRoom(19,"sou uma pop star "),
                InfoRoom(19,"ja fiz o seriado sam e kat "),
                InfoRoom(19,"ja fiz brilhante victoria "),
                InfoRoom(19,"adoro pudim "),
                InfoRoom(19,"tenho descendentes italianos "),
                InfoRoom(19,"minha época preferida é o halloween "),
                InfoRoom(19,"gosto muito de filmes de terror "),
                InfoRoom(19,"nasci em julho "),
                InfoRoom(19,"nmeu signo é de leão "),
                InfoRoom(19,"minhas musicas são um sucesso "),
                InfoRoom(19,"meus melhores amigos são do colegio "),
                InfoRoom(19," tenho apenas 26 anos")

        )

        private val Holywood20 = CelebritiesINFOS("Shailene Woodly", R.drawable.shailenewoodly, 20)

        private val Info20 = listOf<InfoRoom>(
                InfoRoom(20,"Ator20 - ola meu nome é xaiane "),
                InfoRoom(20,"adoro abraçar as pessoas "),
                InfoRoom(20,"gosto de falar alto "),
                InfoRoom(20,"gosto de comer argila "),
                InfoRoom(20,"não gosto muito de celular "),
                InfoRoom(20,"adoro praia "),
                InfoRoom(20,"lavo o cabelo apenas uma vez por mes "),
                InfoRoom(20,"meu habito alimentar muda bastante "),
                InfoRoom(20,"sou associada ao jared leto "),
                InfoRoom(20,"não me preocupo com minha aparencia "),
                InfoRoom(20,"atuei o divergente "),
                InfoRoom(20,"ia ser a mary jane de o espetacular homem aranha 2"),
                InfoRoom(20,"gosto de me vestir do meu jeito "),
                InfoRoom(20,"adoro geoge clooney "),
                InfoRoom(20,"sou segura com meu corpo "),
                InfoRoom(20,"gosto da jennifer lawrence "),
                InfoRoom(20,"fiz a culpa é das estrelas "),
                InfoRoom(20,"detesto crepusculo "),
                InfoRoom(20,"sou muito fã do star wars "),
                InfoRoom(20,"uso roupas do bazar ")

        )


        fun addEverybody(celebritiesDAO: celebritiesDAO) {
            celebritiesDAO.excluCelebritiesfun()

            addPlusCelebrities(Hollywood1, Info1, celebritiesDAO)

            addPlusCelebrities(Hollywood2, Info2, celebritiesDAO)

            addPlusCelebrities(Hollywood3, Info3, celebritiesDAO)

            addPlusCelebrities(Hollywood4, Info4, celebritiesDAO)

            addPlusCelebrities(Hollywood5, Info5, celebritiesDAO)

            addPlusCelebrities(Hollywood6, Info6, celebritiesDAO)

            addPlusCelebrities(Hollywood7, Info7, celebritiesDAO)

            addPlusCelebrities(Hollywood8, Info8, celebritiesDAO)

            addPlusCelebrities(Hollywood9, Info9, celebritiesDAO)

            addPlusCelebrities(Hollywood10, Info10, celebritiesDAO)

            addPlusCelebrities(Hollywood11, quotes11, celebritiesDAO)

            addPlusCelebrities(Hollywood12, Info12,celebritiesDAO)

            addPlusCelebrities(Hollywood13, Info13, celebritiesDAO)

            addPlusCelebrities(Hollywood14, Info14, celebritiesDAO)

            addPlusCelebrities(Holywood15, Info15, celebritiesDAO)

            addPlusCelebrities(Hollywood16, Info16, celebritiesDAO)

            addPlusCelebrities(Hollywood17, Info17,celebritiesDAO)

            addPlusCelebrities(Hollywood18, Info18,celebritiesDAO)

            addPlusCelebrities(Hollywood19, Info19,celebritiesDAO)

            addPlusCelebrities(Holywood20, Info20,celebritiesDAO)
        }
    }
}