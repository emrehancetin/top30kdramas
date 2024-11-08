package com.emrehancetin.top30kdramas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.emrehancetin.top30kdramas.adapter.DramaAdapter
import com.emrehancetin.top30kdramas.databinding.ActivityMainBinding
import com.emrehancetin.top30kdramas.model.Drama

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listOfDramas: ArrayList<Drama>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //https://mydramalist.com/shows/top_korean_dramas
        val drama1 = Drama("Twinkling Watermelon",R.drawable.image1,1,9.2,2023,16,
            "In 2023, Eun Gyeol is a CODA (Child of Deaf Adults) high-school student, but he has a passion for music. During the day, he is a studious model pupil, but at night, he rocks out as a guitarist in a band. But when he stumbles across a strange yet alluring music store, he goes hurtling back in time to 1995.\n" +
                    "\n" +
                    "Here, he comes face to face with his father, Ha Yi Chan – as a high schooler! Yi Chan takes Eun Gyeol for a lunatic when the latter calls him “dad”. Worse still, it looks like Yi Chan has a crush on an icy cellist named Se Kyeong – not his future mother, Cheong Ah!\n" +
                    "\n" +
                    "In a bid to put things “right,” Eun Gyeol joins a band fronted by his future father. But will this be enough to help Eun Gyeol bring his future parents together... and will he ever get back to the 2020s?")
        val drama2 = Drama("Move to Heaven",R.drawable.image2,2,9.1,2021,10,"Han Geu Roo is an autistic 20-year-old. He works for his father’s business “Move To Heaven,” a company that specializes in crime scene cleanup, where they also collect and arrange items left by deceased people, and deliver them to the bereaved family.\n" +
                "\n" +
                "When Geu Roo's father dies, Geu Roo's guardianship passes to his uncle, ex-convict Cho Sang Gu, who is a martial arts fighter in underground matches. Per the father's will, Sang Gu must care for and work with Geu Roo in “Move To Heaven” for three months to gain full guardianship and claim the inheritance. Eying money, Sang Gu agrees to the conditions and moves in.")
        val drama3 = Drama("Hospital Playlist Season 2",R.drawable.image3, 3, 9.1,2021,12,
            "Everyday is extraordinary for five doctors and their patients inside a hospital, where birth, death and everything in between coexist.")
        val drama4 = Drama("Weak Hero Class 1",R.drawable.image4,4,9.1,2022,8,
            "Yeon Shi Eun is a model student who ranks at the top of his high school. Physically, Yeon Shi Eun appears weak, but by using his wits and psychology, he fights against the violence that takes place inside and outside of his school.")

        val drama5 = Drama("Alchemy of Souls",R.drawable.image5,5,9.1,2022,20,
            "Set in a fictional country called Daeho that does not exist in history or on maps, it is about the love and growth of young mages as they overcome their twisted fates due to a forbidden magic spell known as the \"alchemy of souls\", which allows souls to switch bodies.\n" +
                    "\n" +
                    "It follows the story of an elite assassin named Naksu, whose soul is accidentally trapped inside the weak body of Mu Deok—Jang Uk's servant from a powerful and noble mage family in the country. The young master of the Jang Family, Jang Uk, holds a dark secret about his scandalous birth. He wants the formidable assassin to help change his destiny.")
        val drama6 = Drama("Flower of Evil ",R.drawable.image6,6,9.1,2020,16,
            summary = "Although Baek Hui Seong is hiding a dark secret surrounding his true identity, he has established a happy family life and a successful career. He is a loving husband and a doting father to his young daughter. But his perfect façade begins to crumble when his wife, Cha Ji Won, a homicide detective, begins investigating a string of serial murders from 15 years ago. Ji Won notices changes in Hui Seong’s behavior and begins to wonder if he could possibly be hiding something from her." )
        val drama7 = Drama("Moving",R.drawable.image7,7,9.1,2023,20,
            "Kim Bong Seok, Jang Hui Su, and Lee Gang Hun, seemingly typical high school students, bear extraordinary inherited powers. Bong Seok can fly, Hui Su possesses exceptional athleticism and rapid injury recovery, and Gang Hun wields uncanny strength and speed. As they conceal their gifts, their parents fight to shield them from exploitation by others, navigating a delicate balance between secrecy and protection.")
        val drama8 = Drama("Hospital Playlist",R.drawable.image8,8,9.1,2020,12,
            "The stories of people going through their days are seemingly ordinary but actually special at the hospital, a place known as the microcosm of life, where someone is being born and someone's life meets its ending. The five doctors are long-time friends of 20 years who started their undergrad in 1999 in the same medical school and now are colleagues in the same hospital and have a band together.")
        val drama9 = Drama("Reply 1988",R.drawable.image9,9,9.1,2015,20,
        "Five childhood friends, who all live in the same Ssangmundong neighborhood of Seoul, lean on each other to survive their challenging teen years and set a path for their futures. Sung Deok Sun struggles for attention as the middle child in her poor family while also carrying the burden of her 999th ranking in school. Kim Jung Hwan only has a one-track mind for soccer, even after his family becomes rich overnight. Sung Sun Woo is the perfect student, student council president and a caring and dependable son in his family. Ryu Dong Ryong is a geek who knows more about girls and life than the rest of his friends, but his poor academic score prevents him from being able to go to college. Choi Taek is a genius baduk player who dropped out of school to go professional. As the group of friends gets into and out of mischief around the neighborhood, what experiences from these memorable times together will they carry with them into their future lives?")
        val drama10 = Drama("Lovely Runner",R.drawable.image10,10,9.0,2024,16,
            "In the glitzy realm of stardom, Ryu Seon Jae shines as a top-tier celebrity, captivating the spotlight since his debut. Despite the facade of a perfect life, the demanding nature of the entertainment industry has left him utterly exhausted. Im Sol, an ardent admirer, holds an affectionate love for Ryu Seon Jae. A childhood accident derailed her dreams, yet the solace found in Ryu Seon Jae's music on the radio transformed her into an unwavering fan.\n" +
                    "\n" +
                    "The narrative takes a poignant turn when Im Sol, reeling from the breaking news of Ryu Seon Jae's tragic demise, experiences a miraculous twist of fate. Transported back 15 years into the past, she confronts Ryu Seon Jae in his 19-year-old high school self. Im Sol grapples with the formidable challenge of altering the trajectory of his future, driven by an unyielding determination to avert the impending tragedy.")
        val drama11 = Drama("My Mister",R.drawable.image11,11,9.0,2018,16,
            "Park Dong Hoon is a middle-aged engineer who is married to attorney Kang Yoon Hee. However, his life is not that happy as he has two unemployed brothers, Sang Hoon and Gi Hoon, who rely on him. Moreover, his wife is secretly having an affair with CEO Do Joon Yeong, his current boss and college junior.\n" +
                    "\n" +
                    "Receiving an unexpected bribe one day, Dong Hoon notices that his co-worker Lee Ji An witnessed the incident. Ji An is a young part-time worker at Dong Hoon's company who is drowning in debt and left alone to take care of her ill grandmother. Dong Hoon then gets entangled in his brothers' struggle to get back on their feet and the company's internal rivalry between the company's CEO and the people opposing him. All the while, unaware that CEO Joon Yeong wants to get rid of him and that Ji An is working for him.")
        val drama12 = Drama("Under the Queen's Umbrella",R.drawable.image12,12,9.0,2022,16,
            "Within the palace exist troublemaking princes who cause nothing but headaches for the royal family and are about to be turned into proper crown princes. Their mother, Im Hwa Ryeong, is the wife of a great king. But instead of having an aura of elegance and grace, she is a prickly, sensitive, and hot-tempered queen. Once more serene, she changed since people kept pushing her buttons. She is a queen who sometimes abandons her pride and is even known to swear! Every day of her life is full of trials, but she withstands them all, for the sake of her children.")
        val drama13 = Drama("Crash Landing on You",R.drawable.image13,13,9.0,2019,16,
            "After getting into a paragliding accident, South Korean heiress Yoon Se Ri crash lands in North Korea. There, she meets North Korean army officer Ri Jung Hyuk, who agrees to help her return to South Korea. Despite the tension between their countries, the two of them start falling for one another.")
        val drama14 = Drama("The Glory Part 2",R.drawable.image14,14,9.0,2023,8,
            "Moon Dong Eun's silent fury against those students that horrifically abused her during her high school years continues to burn inside of her. She meticulously executes her plan to inflict ultimate pain on her tormentors. Meanwhile, the sudden disappearance of Son Myeong Oh has gotten the attention of the police and his friends. Joo Yeo Jeong follows Moon Dong Eun and is willing to do anything she asks in her pursuit of revenge. Before Moon Dong Eun begins her final moves, she offers her nemesis Park Yeon Jin a chance to save herself if she turns in to the police, but Park Yeon Jin has her own plans to stop Moon Dong Eun. A violent and bloody game of nerves plays out between these rivals.")
        val drama15 = Drama("Mr. Queen",R.drawable.image15,15,9.0,2020,20,
            "Jang Bong Hwan is a South Korean chef who has risen up the ranks to cook for the country’s top politicians in the Blue House’s presidential residences. After a serious accident, he finds himself in the body of the young queen, Kim So Yong, when whisked away to an era deep in Korea’s past.\n" +
                    "\n" +
                    "While Queen Kim So Yong’s husband is the reigning monarch, King Cheol Jong, he is so in name only. The late King Sunjo’s Queen, Sun Won, has taken advantage of King Cheol Jong’s better nature, and is ruling the realm in his name. And she faces competition from her own brother, Kim Jwa Geun, who also has designs on power.\n" +
                    "\n" +
                    "Queen Kim So Yong will come to discover that her husband harbours some secrets, and is not as gentle and meek as he seems…")
        val drama16 = Drama("Prison Playbook",R.drawable.image16,16,8.9,2017,16,
            "Kim Je Hyuk, a famous baseball player, is arrested after using excessive force while chasing a man trying to sexually assault his sister. Shockingly to him and the rest of the nation, he is sentenced to a year in prison. There, he meets his childhood friend and fellow baseball player, Lee Joon Ho, who gave up on baseball after a car accident, but is now a prison guard and one of Je Hyuk's biggest fans. The drama revolves around Je Hyuk's time in prison, as well as the prisoners he meets and the events that take place there.\n")
        val drama17 = Drama("Mother",R.drawable.image17,7,8.9,2018,16,
            "Realizing one of her students is being abused, school teacher and bird researcher Soo Jin impulsively kidnaps the girl and acts as a substitute mother in an attempt to take care of her.")
        val drama18 = Drama("My Dearest",R.drawable.image18,18,8.9,2023,10,
            "A love-story between a noblewoman and a mysterious man who shows up in her hometown set in the 1600s during the Qing invasion.\n" +
                    "\n" +
                    "Yu Gil Chae is a pretty, bubbly, and a bit spoiled young lady who's called the 99 tailed fox of Neunggun-ri. She is also a bit of an outcast because other young ladies are jealous of her. They seem to think she's too straightforward and her behavior is inappropriate for a young lady, while young noblemen think highly of her. Gil Chae knows how to get men to fall for her but fails to capture the heart of the person she likes.\n" +
                    "\n" +
                    "Lee Jang Hyun is a mysterious man who suddenly appears in the Neunggun-ri social scene. Nobody really knows anything about him. Young nobles don't like him, but the elderly are wrapped around his finger. He's been dating around a lot, but he becomes curious about a certain 99 tailed fox, and one day, the said fox quite literally crash lands into his arms.\n" +
                    "\n" +
                    "Once war is brewing, the pair finds themselves separated before they could even start to make sense of their feelings.\n")
        val drama19 = Drama("Dr. Romantic Season 3",R.drawable.image19,19,8.9,2023,16,
            "At Doldam Hospital, Dr. Kim Sa Bu and his team are committed to saving lives. After three years, a state-of-the-art trauma centre is set to open, equipped with the latest in medical technology.\n" +
                    "\n" +
                    "Prior to the centre's official opening, however, a crisis unfolds on a North Korean ship that's drifted into South Korean waters. Doctors from Doldam Hospital fly out to help the critically injured aboard the ship. However, the patients need to be transported to the hospital. To complicate matters, the South Korean government wants the North Korean patients returned to their country as part of diplomatic efforts with their neighbouring country.\n" +
                    "\n" +
                    "Amidst the chaos, Cha Jin Man—the father of Cha Eun Jae and a former rival of Dr. Kim Sa Bu—is brought on board to run the new trauma centre.")
        val drama20 = Drama("It's Okay to Not Be Okay",R.drawable.image20,20,8.9,2020,16,
            "Moon Gang Tae is a community health worker at a psychiatric ward who was blessed with everything including a great body, smarts, ability to sympathize with others, patience, ability to react quickly, stamina, and more. Meanwhile, Ko Moon Young is a popular writer of children’s literature who, due to suffering from an antisocial personality disorder, seems extremely selfish, arrogant, and rude.\n" +
                    "\n" +
                    "Moon Gang Tae denies love and Ko Moon Young doesn’t know it. The two defy fate and fall in love, finding their souls and identities in the process.")
        val drama21 = Drama("The Glory ",R.drawable.image21,21,8.9,2022,8,
            "A high school student dreams of becoming an architect. However, she had to drop out of school after suffering from brutal school violence. Years later, the perpetrator gets married and has a kid. Once the kid is in elementary school, the former victim becomes her homeroom teacher and starts her thorough revenge towards the perpetrators and bystanders of her bullying days.")
        val drama22 = Drama("My Dearest Part 2",R.drawable.image22,22,8.9,2023,11,
            "Jang Hyun is living without purpose or desire. He's a cold-hearted man who loves no one until he gets introduced to love after meeting Gil Chae. She is charming and admired by all, but her first love, Yeon Jun, is already engaged to her best friend, Eun Ae. Yeon Jun, a Sungkyunkwan student, struggles with his feelings for Gil Chae but cannot break off his engagement due to tradition. Eun Ae does not doubt nor hate the two.\n" +
                    "\n" +
                    "As Jang Hyun becomes entangled in this unusual love triangle, Gil Chae, who has only loved Yeon Jun, is confused about her own feelings. The relationship between these four gets put into an even bigger twist at the breakout of war. Will they survive the challenges of war and find their love amidst the chaos?")
        val drama23 = Drama("Alchemy of Souls Season 2: Light and Shadow",R.drawable.image23,23,8.9,2022,10,
            "Jang Uk returns from death, and three years later, the story of the mages unfolds anew. Jang Uk becomes a hunter of the soul-shifters when a young woman, a prisoner in her own home, seeks his help to reclaim her freedom.")
        val drama24 = Drama("Extraordinary Attorney Woo",R.drawable.image24,24,8.9,2022,16,
            "Diagnosed with autism spectrum disorder, 27-year-old Woo Young Woo graduated at the top of her class from the prestigious Seoul National University for both college and law school due to her high IQ of 164, impressive memory, and creative thought process. Working as a lawyer, she finds herself struggling when it comes to social interactions.")
        val drama25 = Drama("Navillera",R.drawable.image25,25,8.9,2021,12,
            "A 70-year-old with a dream and a 23-year-old with a gift lift each other out of harsh realities and rise to the challenge of becoming ballerinos.\n" +
                    "\n" +
                    "Shim Deok Chul has had a life long dreaming of performing ballet. He is 70-years-old and retired from his job as a post office employee. Due to life situations, he put aside his dream of becoming a ballet dancer and worked a normal job to support his family. Now, Shim Deok Chul makes the decision to pursue his dream again. His family, including his wife and adult children, are not happy with his decision, but Shim Deok Chul does not waver in pursuing his life long dream. He joins a ballet company to learn ballet. There, he meets Lee Chae Rok.\n" +
                    "\n" +
                    "Lee Chae Rok is a 23-year-old man. While growing up, he played different sports like baseball, swimming, and soccer, but he wasn't talented in any of those activities. He then became interested in ballet. His mother was a ballet dancer, but she died from a disease when Lee Chae Rok was young. His father later went bankrupt. Lee Chae Rok learned that he has a talent for ballet, but, after pursuing ballet, he barely has contact with his father and he has a hard time supporting himself financially. Going through hard times, his desire for ballet fades away. At this time, Sim Deok Chul appears in front of him.")
        val drama26 = Drama("Signal",R.drawable.image26,26,8.9,2016,16,
            "Fifteen years ago, a young girl was kidnapped on the way from school, and Park Hae Yeong, who was an elementary school student at that time, witnessed the crime. A few days later, the girl was found dead, and the police were not able to find the culprit. As time went by, Hae Yeong started distrusting the police.\n" +
                    "\n" +
                    "Fifteen years later, Hae Yeong is now a police officer and criminal profiler. One day, he finds a walkie-talkie that allows him to get in contact with Detective Lee Jae Han who is in the past. Police officers Hae Yeong, Jae Han, and Cha Soo Hyun then set out on a journey to solve cold cases.")
        val drama27 = Drama("Vincenzo",R.drawable.image27,27,8.9,2021,20,
            "At the age of eight, Park Joo Hyeong left for Italy after being adopted. Now an adult, he is known as Vincenzo Cassano and employed by a Mafia family as a consigliere. Due to warring Mafia factions, he flies to South Korea where he gets involved with lawyer Hong Cha Young. She is the type of attorney who will do anything to win a case. Now back in his motherland, he gives an unrivalled conglomerate a taste of his own medicine—with a side of his own version of justice.")
        val drama28 = Drama("The Good Bad Mother",R.drawable.image28,28,8.9,2023,14,
            "Young Soon is a single mother and pig farmer who raised her son Kang Ho alone. Despite her love for him, her strict parenting caused Kang Ho to view her as a bad mother. As an adult, Kang Ho became a cold-hearted prosecutor and kept his distance from his mother. However, an unexpected accident caused him to return to his hometown and start over with Young Soon. Kang Ho's childhood friend Mi Joo, known for her warm heart and strong sense of justice, also reconnected with him after his accident, leading to a transformative experience for her.")
        val drama29 = Drama("Taxi Driver Season 2",R.drawable.image29,29,8.9,2023,16,
            "Despite disbanding after Do Gi's successful revenge, the Rainbow Deluxe Taxi crew, including Seong Cheol, Go Eun, Gyeong Gu, and Jin Eon, can't resist the call to reunite with their former leader. Though each attempts to live a regular life with a typical job, their innate desire to fight against injustice draws them back to one another. The group even welcomes a new member, a kind-hearted but clumsy young man named On Ha Jun, who stumbles upon the secret basement of Rainbow Taxi.\n" +
                    "\n" +
                    "Now fighting for more clients than ever before, the crew continues to battle on behalf of those wronged by an unequal society. However, their work draws the attention of a mysterious organization, which makes its presence known by killing one of Do Gi's targets before disappearing without a trace. As they try to uncover the organization's identity and motives, the Rainbow Taxi crew faces their toughest challenge yet.")
        val drama30 = Drama("Death's Game Part 2",R.drawable.image30,30,8.9,2024,4,
            "After learning what Death meant when they said his death would become more painful, Choi Yi Jae becomes hellbent on revenge.")

        listOfDramas = arrayListOf(drama1,drama2,drama3,drama4,drama5,
                                    drama6,drama7,drama8,drama9,drama10,
                                    drama11,drama12,drama13,drama14,drama15,
                                    drama16,drama17,drama18,drama19,drama20,
                                    drama21,drama22,drama23,drama24,drama25,
                                    drama26,drama27,drama28,drama29,drama30)
        val adapter = DramaAdapter(listOfDramas)
        binding.viewRec.layoutManager = LinearLayoutManager(this)
        binding.viewRec.adapter = adapter
    }

}