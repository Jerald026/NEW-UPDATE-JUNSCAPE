package com.example.hp.junscape;


import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Trash> trashes;

    @Override
    public void onCreate() {
        super.onCreate();

        trashes = new ArrayList<Trash>();
        trashes.add(new Trash("banana peel", "biodegradable", "Banana Peel – 2-5 Weeks", "Banana skins can take longer than this to decompose " +
                "\nif the weather is cold, as the skins are designed to" +
                "\n protect the fruit inside. They are full of cellulose which is " +
                "\nthe same" +
                "\nmaterial from which cellophane wrappers are made.\n" +
                "\tDispose:\n" +
                "\t\tBanana peels can be used as compost material, as they add nutrients such as magnesium and potassium to the soil and help plants to grow.\n" +
                "\t\tProbably the most popular – and easiest – use for banana peels is to mix them into the compost pile. Peels add potassium and phosphorus to compost which promote root development and overall plant health when incorporated into garden soil. Just be aware that banana peels are green material and too much of a good thing can offset the balance of your compost.\n"));
        trashes.add(new Trash("leaf", "biodegradable", "Leaf – 2 years", "Without human intervention, a leaf takes about two years to decompose naturally. The actual amount of time for decomposition is affected by factors that include heat, the type of leaf and the amount of exposure to oxygen.\n" +
                "\tDispose:\n" +
                "\t\t1. Mulch them into the lawn. Optionally, you can aerate your lawn first to provide nutrients deeper into the soil.  Mulch the leaves into small pieces with your mower, about dime-sized. You may have to mow over them a few times if the leaves are large or the layer is deep. When you cleanup a yard like this, you will leave the small pieces on the lawn to work their way into the soil. Leaf mulch suppresses weeds and fertilizes the ground. Mulched leaves will enrich your soil in the spring.\n" +
                "\t\t2. Make mulch for gardens or flower beds. One you have collected the leaves, you can shred them for use in compost or mulch. Put the leaves into a large trash can. Then break them down with a weed whacker. You could use a leaf shredder instead.\n" +
                "\t\t3. Compost them. Turn your leaves into “black gold!” Compost is excellent natural fertilizer for your lawn and garden. You may want to break the leaves down into mulch before putting them into the compost pile if you want them to decompose faster. You can use the decomposed leaves to fertilize your garden in the spring.\n" +
                "\t\t4. Dig them in with a tiller. Shred the leaves first. Then you can till the chopped leaves into the soil with a tiller. This will provide organic matter and nutrients to feed your lawn in the spring.\n" +
                "\t\t5. Ask your locality. Contact your local township, city or county and ask about an autumn cleanup policy. If they don’t have one, find out how to dispose of leaves and other backyard waste. Some county and city officials have specific regulations for you to follow when you cleanup a yard.\n" +
                "\t\t6. Offer them to a neighbor. Your trees should seem healthy with no known fungal or other diseases. Bag your leaves and offer them to neighbors who may want mulch or compost. This can be especially helpful for neighbors with gardens or flower beds.\n" +
                "\t\t7. Burn the leaves. You may choose to burn the leaves if you live in an area that permits this. You may need a fire permit to dispose of leaves in this way. Some states and towns require a member of the fire department to be present for the duration of the fire, while others require you to notify the fire department in advance.\n" +
                "\t\t8. Make crafts. You can use fall leaves as fun craft projects. There are various ways you can preserve leaves. You can then use them to make bookmarks, coasters, wall art, candle holders, and many other crafts for kids or adults.\n"));
        trashes.add(new Trash("milk box", "non-biodegradable", "Milk Box – 5 years", "Heavily processed cardboard, such as juice or milk cartons, is coated with a wax or similar substance to prevent leakage. These will decompose, given about five years, but their resistance to water will significantly prolong the process. Corrugated cardboard will break down significantly more quickly.\n" +
                "\tDispose:\n" +
                "\t\t1. Make planters. Use old milk cartons to make small planters for your balcony or garden. Use a utility knife to either cut off the top of your milk carton, or lay the milk carton on its side and cut open the side facing upwards. Poke holes at the bottom of the planter using a sewing needle or nail before filling it with soil and planting seeds in it, which will allow the for drainage.\n" +
                "\t\t2. Freeze giant ice cubes. Clean a milk container thoroughly and fill it with water. Put it in the freezer and leave it overnight to freeze. Cut away the carton and use the giant ice block in your cooler for day trips, or as a cool way to keep your refreshments cold at parties!\n" +
                "\t\t3. Use them as paint containers. Old milk cartons make great, compact paint containers to use for touch-ups or small jobs. Simply clean your carton, cut off the top, and pour in as much paint as you need. Dispose of the carton after you finish painting for hassle-free cleaning.\n" +
                "\t\t4. Make bird feeders. Staple together the top of an empty, clean milk carton. Draw \"windows\" on three sides of the carton leaving 2 inches (approximately 5 cm) from the bottom, then cut them out using a utility knife. Poke two holes at the top of the carton and thread in strong string (e.g. fishing wire, twine) to hang the bird feeder securely once you fill it with seeds.\n"));
        trashes.add(new Trash("crumpled paper", "biodegradable", "Crumpled Paper – 2-4 weeks", "Paper is a material much closer to something you might find in nature than plastics. Paper has been around in one form or another since over 2000 years ago when it was made from the fibers of a tree mixed with water. Modern-day paper is slightly different but still consists mainly of wood pulp mixed with water. White paper is bleached to remove the color of the lignin but it is still mostly wood. Because it is made of organic material, the paper does actually decompose.\n" +
                "\tDispose:\n" +
                "\t\t1. Buy a paper shredder. Paper shredders come in a variety of shapes, sizes and qualities. In general, the most effective shredders are usually those with the higher price tags. These also tend to be able to shred a higher volume of paper more efficiently. Which shredder you choose entirely depends on your needs. Any office supply store will carry a range of shredders for both home and office use.\n" +
                "\t\t2. Investigate document destruction services. If you don’t want to invest in a shredder, or if the amount you have to shred is very large, there are companies that specialize in document disposal. The cost is relatively low, and it’s common for these businesses to allow you to watch your documents being shredded, for your own peace of mind.\n" +
                "\t\t3. Shred the paper using a shredder. Follow the instruction manual carefully. Shredders can jam up very easily if you try to pass through too many documents at once.\n" +
                "\t\t4. Shred the paper by hand. You probably only want to do this if you have a relatively small amount of paper to dispose of, as this method can be rather time-consuming. It’s generally not a recommended way to dispose of documents that contain sensitive information. If you do choose this method, make sure you do tear the paper into very small pieces.\n" +
                "\t\t5. Recycle the shredded material. After paper is shredded, it is still viable for recycling and there is no security risk in doing this. If the amount of shredded material will fit into your home recycling bin, its fine to put it in there. If you have a large volume of shredded material, it’s better to take it to a recycling agency yourself.\n" +
                "\n"));
        trashes.add(new Trash("soda can", "non-biodagradable", "Soda Can – 80-200 years", "When landfill waste is incinerated, the aluminum (from cans or other household products) can react with water vapor at high temperature (and generate hydrogen gas). The prevailing temperature on the grate of a modern municipal waste incinerator is nominally over 850 C, which is considerably higher than aluminum melting point. Some scrap metal aluminum turns into molten droplets and combines with other metals to form aggregates of various metallic alloys.\n" +
                "\tDispose:\n" +
                "\t\t1. Empty the soda cans completely. Rinse out the cans with clean water and turn them upside down on a towel to drain.\n" +
                "\t\t2. Collect the cans in a recycling bin marked for aluminum cans only until the container is full.\n" +
                "\t\t3. Find out which recycling opportunities exist in your community and decide which you want to use. The simplest way to do this is to contact your municipality's sanitation or solid-waste disposal department and ask about your options. If your town offers curbside recycling, the sanitation department will send you instructions on participating, including a calendar of pickup days for your neighborhood.\n" +
                "\t\t4. If your town does not have curbside recycling, take the clean, dry cans to the nearest recycling or buy-back center. Your local sanitation department may have a list of local centers that accept aluminum; otherwise, use a searchable site to find a recycling center near you.\n" +
                "\t\t5. Inquire at local supermarkets to see if they accept soda cans. A few states have bottle deposit laws that require supermarkets to accept the cans and pay a small fee --- a few cents per can --- to the person who drops them off. This fee is technically the return of a \"deposit\" every consumer pays when he purchases a beverage in an aluminum can in that state --- it's a measure put in place to encourage consumers to be responsible with this type of waste, recycling it instead of throwing it in the trash.\n"));
        trashes.add(new Trash("chips", "non-biodagradable", "Bag of Chips – 10-20 years", "Biodegradable plastics take three to six months to decompose fully. That’s much quicker than synthetic counterparts that take several hundred years. Exactly how long a biodegradable bag takes to break down depends on various factors, such as temperature and the amount of moisture present.\n" +
                "But the bags aren’t always as environmentally friendly as they seem. They’re made from similar petrochemical-based materials to conventional plastic, only with compounds added that cause them to disintegrate gradually in the presence of light or oxygen. They often then degrade into a sludge of toxic chemicals.\n" +
                "Dispose:\n" +
                "\tRecycling chip bags can be difficult as it has different layers in it. Some can be recycled and some cannot be recycled. Separating them is next to impossible. The best way is to repurpose them and make upcycled pouches from it. Coming up with some nice and sturdy bags made from chip bags. In order to recycle this waste stream properly, please make sure all excess product has been removed (i.e. leftover chips).\n"));
        trashes.add(new Trash("tire", "non-biodagradable", "Tire – 50-80 years", "Tire recycling, or rubber recycling, is the process of recycling waste tires that are no longer suitable for use on vehicles due to wear or irreparable damage. These tires are a challenging source of waste, due to the large volume produced, the durability of the tires, and the components in the tire that are ecologically problematic. Because tires are highly durable and non-biodegradable, they can consume valued space in landfills.\n" +
                "\tDispose:\n" +
                "\t\t1. Leave your old tires when you get new ones for the easiest solution. Many tire retailers build the cost of taking your old tires into the price of buying and installing new ones.\n" +
                "\t\t2. Bring old tires to a retailer even if you're not buying new tires. Regardless of whether you buy new tires from them, many tire retailers will accept old tires for a small fee. Call tire retailers in your area and ask if they take old tires, what they do with them, and how many they will accept.\n" +
                "\t\t3. Get rid of tires and other troublesome junk at a hard-to-recycle event. Hard-to-recycle events have become popular in recent years as a way for people to get rid of things like old TVs, appliances, and tires that can’t be put out with municipal trash. Check local news sources, social media, and government websites for information on when and where events will occur in your area.\n"));
        trashes.add(new Trash("fish bone", "biodagradable", "Fish Bone – never", "\tBones are made of something around 60% inorganic material (mostly calcium phosphate) and collagen (a protein). That collagen can be broken down by fungi and bacteria under favorable conditions - warm and moist compost that gets aerated regularly should these conditions. The calcium phosphate will break down in acidic conditions - and often compost bins have slightly acidic pH so the material will slowly break down the calcium phosphate - but it can take a while.\n" +
                "\tDispose:\n" +
                "\t\tPut fish bones down the garbage disposal. Disposals can handle fish bones, chicken bones and Pork Chop bones quite nicely. In fact, it is recommended that you dispose of these in a disposer as ground up bone make small, sharp particle that help to keep your plumbing lines clean as they flow through it, with a “scouring” type action. As far as your fish bones, chicken bones, pork chop bones… by all means. It is a safe and sanitary way to dispose of them and it actually helps clean your disposals grinding chamber and scour the plumbing lines as they pass through.\n"));

    }

}