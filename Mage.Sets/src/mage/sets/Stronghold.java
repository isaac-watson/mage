/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author North
 */
public class Stronghold extends ExpansionSet {

    private static final Stronghold instance = new Stronghold();

    public static Stronghold getInstance() {
        return instance;
    }

    private Stronghold() {
        super("Stronghold", "STH", ExpansionSet.buildDate(1998, 3, 2), SetType.EXPANSION);
        this.blockName = "Tempest";
        this.parentSet = Tempest.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Acidic Sliver", 138, Rarity.UNCOMMON, mage.cards.a.AcidicSliver.class));
        cards.add(new SetCardInfo("Amok", 76, Rarity.RARE, mage.cards.a.Amok.class));
        cards.add(new SetCardInfo("Awakening", 51, Rarity.RARE, mage.cards.a.Awakening.class));
        cards.add(new SetCardInfo("Bandage", 101, Rarity.COMMON, mage.cards.b.Bandage.class));
        cards.add(new SetCardInfo("Bottomless Pit", 1, Rarity.UNCOMMON, mage.cards.b.BottomlessPit.class));
        cards.add(new SetCardInfo("Brush with Death", 2, Rarity.COMMON, mage.cards.b.BrushWithDeath.class));
        cards.add(new SetCardInfo("Bullwhip", 126, Rarity.UNCOMMON, mage.cards.b.Bullwhip.class));
        cards.add(new SetCardInfo("Burgeoning", 52, Rarity.RARE, mage.cards.b.Burgeoning.class));
        cards.add(new SetCardInfo("Calming Licid", 102, Rarity.UNCOMMON, mage.cards.c.CalmingLicid.class));
        cards.add(new SetCardInfo("Cannibalize", 3, Rarity.COMMON, mage.cards.c.Cannibalize.class));
        cards.add(new SetCardInfo("Carnassid", 53, Rarity.RARE, mage.cards.c.Carnassid.class));
        cards.add(new SetCardInfo("Change of Heart", 103, Rarity.COMMON, mage.cards.c.ChangeOfHeart.class));
        cards.add(new SetCardInfo("Cloud Spirit", 26, Rarity.COMMON, mage.cards.c.CloudSpirit.class));
        cards.add(new SetCardInfo("Constant Mists", 54, Rarity.UNCOMMON, mage.cards.c.ConstantMists.class));
        cards.add(new SetCardInfo("Contemplation", 104, Rarity.UNCOMMON, mage.cards.c.Contemplation.class));
        cards.add(new SetCardInfo("Conviction", 105, Rarity.COMMON, mage.cards.c.Conviction.class));
        cards.add(new SetCardInfo("Convulsing Licid", 77, Rarity.UNCOMMON, mage.cards.c.ConvulsingLicid.class));
        cards.add(new SetCardInfo("Corrupting Licid", 4, Rarity.UNCOMMON, mage.cards.c.CorruptingLicid.class));
        cards.add(new SetCardInfo("Craven Giant", 78, Rarity.COMMON, mage.cards.c.CravenGiant.class));
        cards.add(new SetCardInfo("Crossbow Ambush", 55, Rarity.COMMON, mage.cards.c.CrossbowAmbush.class));
        cards.add(new SetCardInfo("Crovax the Cursed", 5, Rarity.RARE, mage.cards.c.CrovaxTheCursed.class));
        cards.add(new SetCardInfo("Crystalline Sliver", 139, Rarity.UNCOMMON, mage.cards.c.CrystallineSliver.class));
        cards.add(new SetCardInfo("Dauthi Trapper", 6, Rarity.UNCOMMON, mage.cards.d.DauthiTrapper.class));
        cards.add(new SetCardInfo("Death Stroke", 7, Rarity.COMMON, mage.cards.d.DeathStroke.class));
        cards.add(new SetCardInfo("Dream Halls", 28, Rarity.RARE, mage.cards.d.DreamHalls.class));
        cards.add(new SetCardInfo("Dream Prowler", 29, Rarity.COMMON, mage.cards.d.DreamProwler.class));
        cards.add(new SetCardInfo("Duct Crawler", 79, Rarity.COMMON, mage.cards.d.DuctCrawler.class));
        cards.add(new SetCardInfo("Dungeon Shade", 8, Rarity.COMMON, mage.cards.d.DungeonShade.class));
        cards.add(new SetCardInfo("Elven Rite", 56, Rarity.UNCOMMON, mage.cards.e.ElvenRite.class));
        cards.add(new SetCardInfo("Endangered Armodon", 57, Rarity.COMMON, mage.cards.e.EndangeredArmodon.class));
        cards.add(new SetCardInfo("Ensnaring Bridge", 127, Rarity.RARE, mage.cards.e.EnsnaringBridge.class));
        cards.add(new SetCardInfo("Evacuation", 30, Rarity.RARE, mage.cards.e.Evacuation.class));
        cards.add(new SetCardInfo("Fanning the Flames", 80, Rarity.UNCOMMON, mage.cards.f.FanningTheFlames.class));
        cards.add(new SetCardInfo("Flame Wave", 81, Rarity.UNCOMMON, mage.cards.f.FlameWave.class));
        cards.add(new SetCardInfo("Fling", 82, Rarity.COMMON, mage.cards.f.Fling.class));
        cards.add(new SetCardInfo("Flowstone Blade", 83, Rarity.COMMON, mage.cards.f.FlowstoneBlade.class));
        cards.add(new SetCardInfo("Flowstone Hellion", 84, Rarity.UNCOMMON, mage.cards.f.FlowstoneHellion.class));
        cards.add(new SetCardInfo("Flowstone Mauler", 85, Rarity.RARE, mage.cards.f.FlowstoneMauler.class));
        cards.add(new SetCardInfo("Flowstone Shambler", 86, Rarity.COMMON, mage.cards.f.FlowstoneShambler.class));
        cards.add(new SetCardInfo("Foul Imp", 9, Rarity.COMMON, mage.cards.f.FoulImp.class));
        cards.add(new SetCardInfo("Furnace Spirit", 87, Rarity.COMMON, mage.cards.f.FurnaceSpirit.class));
        cards.add(new SetCardInfo("Gliding Licid", 31, Rarity.UNCOMMON, mage.cards.g.GlidingLicid.class));
        cards.add(new SetCardInfo("Grave Pact", 10, Rarity.RARE, mage.cards.g.GravePact.class));
        cards.add(new SetCardInfo("Hammerhead Shark", 32, Rarity.COMMON, mage.cards.h.HammerheadShark.class));
        cards.add(new SetCardInfo("Heartstone", 128, Rarity.UNCOMMON, mage.cards.h.Heartstone.class));
        cards.add(new SetCardInfo("Heat of Battle", 88, Rarity.UNCOMMON, mage.cards.h.HeatOfBattle.class));
        cards.add(new SetCardInfo("Hermit Druid", 58, Rarity.RARE, mage.cards.h.HermitDruid.class));
        cards.add(new SetCardInfo("Hesitation", 33, Rarity.UNCOMMON, mage.cards.h.Hesitation.class));
        cards.add(new SetCardInfo("Hibernation Sliver", 140, Rarity.UNCOMMON, mage.cards.h.HibernationSliver.class));
        cards.add(new SetCardInfo("Honor Guard", 107, Rarity.COMMON, mage.cards.h.HonorGuard.class));
        cards.add(new SetCardInfo("Hornet Cannon", 130, Rarity.UNCOMMON, mage.cards.h.HornetCannon.class));
        cards.add(new SetCardInfo("Horn of Greed", 129, Rarity.RARE, mage.cards.h.HornOfGreed.class));
        cards.add(new SetCardInfo("Intruder Alarm", 34, Rarity.RARE, mage.cards.i.IntruderAlarm.class));
        cards.add(new SetCardInfo("Invasion Plans", 89, Rarity.RARE, mage.cards.i.InvasionPlans.class));
        cards.add(new SetCardInfo("Jinxed Ring", 131, Rarity.RARE, mage.cards.j.JinxedRing.class));
        cards.add(new SetCardInfo("Lab Rats", 11, Rarity.COMMON, mage.cards.l.LabRats.class));
        cards.add(new SetCardInfo("Lancers en-Kor", 108, Rarity.UNCOMMON, mage.cards.l.LancersEnKor.class));
        cards.add(new SetCardInfo("Leap", 35, Rarity.COMMON, mage.cards.l.Leap.class));
        cards.add(new SetCardInfo("Lowland Basilisk", 59, Rarity.COMMON, mage.cards.l.LowlandBasilisk.class));
        cards.add(new SetCardInfo("Mana Leak", 36, Rarity.COMMON, mage.cards.m.ManaLeak.class));
        cards.add(new SetCardInfo("Megrim", 12, Rarity.UNCOMMON, mage.cards.m.Megrim.class));
        cards.add(new SetCardInfo("Mind Games", 38, Rarity.COMMON, mage.cards.m.MindGames.class));
        cards.add(new SetCardInfo("Mind Peel", 13, Rarity.UNCOMMON, mage.cards.m.MindPeel.class));
        cards.add(new SetCardInfo("Mindwarper", 14, Rarity.RARE, mage.cards.m.Mindwarper.class));
        cards.add(new SetCardInfo("Mob Justice", 90, Rarity.COMMON, mage.cards.m.MobJustice.class));
        cards.add(new SetCardInfo("Mogg Flunkies", 92, Rarity.COMMON, mage.cards.m.MoggFlunkies.class));
        cards.add(new SetCardInfo("Mogg Infestation", 93, Rarity.RARE, mage.cards.m.MoggInfestation.class));
        cards.add(new SetCardInfo("Mogg Maniac", 94, Rarity.UNCOMMON, mage.cards.m.MoggManiac.class));
        cards.add(new SetCardInfo("Morgue Thrull", 15, Rarity.COMMON, mage.cards.m.MorgueThrull.class));
        cards.add(new SetCardInfo("Mortuary", 16, Rarity.RARE, mage.cards.m.Mortuary.class));
        cards.add(new SetCardInfo("Mox Diamond", 132, Rarity.RARE, mage.cards.m.MoxDiamond.class));
        cards.add(new SetCardInfo("Mulch", 60, Rarity.COMMON, mage.cards.m.Mulch.class));
        cards.add(new SetCardInfo("Nomads en-Kor", 109, Rarity.COMMON, mage.cards.n.NomadsEnKor.class));
        cards.add(new SetCardInfo("Overgrowth", 61, Rarity.COMMON, mage.cards.o.Overgrowth.class));
        cards.add(new SetCardInfo("Portcullis", 133, Rarity.RARE, mage.cards.p.Portcullis.class));
        cards.add(new SetCardInfo("Primal Rage", 62, Rarity.UNCOMMON, mage.cards.p.PrimalRage.class));
        cards.add(new SetCardInfo("Provoke", 63, Rarity.COMMON, mage.cards.p.Provoke.class));
        cards.add(new SetCardInfo("Pursuit of Knowledge", 110, Rarity.RARE, mage.cards.p.PursuitOfKnowledge.class));
        cards.add(new SetCardInfo("Rabid Rats", 17, Rarity.COMMON, mage.cards.r.RabidRats.class));
        cards.add(new SetCardInfo("Reins of Power", 41, Rarity.RARE, mage.cards.r.ReinsOfPower.class));
        cards.add(new SetCardInfo("Revenant", 18, Rarity.RARE, mage.cards.r.Revenant.class));
        cards.add(new SetCardInfo("Rolling Stones", 111, Rarity.RARE, mage.cards.r.RollingStones.class));
        cards.add(new SetCardInfo("Ruination", 95, Rarity.RARE, mage.cards.r.Ruination.class));
        cards.add(new SetCardInfo("Sacred Ground", 112, Rarity.RARE, mage.cards.s.SacredGround.class));
        cards.add(new SetCardInfo("Scapegoat", 114, Rarity.UNCOMMON, mage.cards.s.Scapegoat.class));
        cards.add(new SetCardInfo("Seething Anger", 96, Rarity.COMMON, mage.cards.s.SeethingAnger.class));
        cards.add(new SetCardInfo("Serpent Warrior", 19, Rarity.COMMON, mage.cards.s.SerpentWarrior.class));
        cards.add(new SetCardInfo("Shaman en-Kor", 115, Rarity.RARE, mage.cards.s.ShamanEnKor.class));
        cards.add(new SetCardInfo("Shard Phoenix", 97, Rarity.RARE, mage.cards.s.ShardPhoenix.class));
        cards.add(new SetCardInfo("Shifting Wall", 134, Rarity.UNCOMMON, mage.cards.s.ShiftingWall.class));
        cards.add(new SetCardInfo("Shock", 98, Rarity.COMMON, mage.cards.s.Shock.class));
        cards.add(new SetCardInfo("Sift", 42, Rarity.COMMON, mage.cards.s.Sift.class));
        cards.add(new SetCardInfo("Silver Wyvern", 43, Rarity.RARE, mage.cards.s.SilverWyvern.class));
        cards.add(new SetCardInfo("Skyshroud Archer", 64, Rarity.COMMON, mage.cards.s.SkyshroudArcher.class));
        cards.add(new SetCardInfo("Skyshroud Falcon", 116, Rarity.COMMON, mage.cards.s.SkyshroudFalcon.class));
        cards.add(new SetCardInfo("Skyshroud Troopers", 65, Rarity.COMMON, mage.cards.s.SkyshroudTroopers.class));
        cards.add(new SetCardInfo("Sliver Queen", 141, Rarity.RARE, mage.cards.s.SliverQueen.class));
        cards.add(new SetCardInfo("Smite", 117, Rarity.COMMON, mage.cards.s.Smite.class));
        cards.add(new SetCardInfo("Soltari Champion", 118, Rarity.RARE, mage.cards.s.SoltariChampion.class));
        cards.add(new SetCardInfo("Spike Breeder", 66, Rarity.RARE, mage.cards.s.SpikeBreeder.class));
        cards.add(new SetCardInfo("Spike Colony", 67, Rarity.COMMON, mage.cards.s.SpikeColony.class));
        cards.add(new SetCardInfo("Spike Feeder", 68, Rarity.UNCOMMON, mage.cards.s.SpikeFeeder.class));
        cards.add(new SetCardInfo("Spike Soldier", 69, Rarity.UNCOMMON, mage.cards.s.SpikeSoldier.class));
        cards.add(new SetCardInfo("Spike Worker", 70, Rarity.COMMON, mage.cards.s.SpikeWorker.class));
        cards.add(new SetCardInfo("Spindrift Drake", 44, Rarity.COMMON, mage.cards.s.SpindriftDrake.class));
        cards.add(new SetCardInfo("Spined Sliver", 142, Rarity.UNCOMMON, mage.cards.s.SpinedSliver.class));
        cards.add(new SetCardInfo("Spined Wurm", 71, Rarity.COMMON, mage.cards.s.SpinedWurm.class));
        cards.add(new SetCardInfo("Spirit en-Kor", 119, Rarity.COMMON, mage.cards.s.SpiritEnKor.class));
        cards.add(new SetCardInfo("Spitting Hydra", 99, Rarity.RARE, mage.cards.s.SpittingHydra.class));
        cards.add(new SetCardInfo("Stronghold Assassin", 21, Rarity.RARE, mage.cards.s.StrongholdAssassin.class));
        cards.add(new SetCardInfo("Stronghold Taskmaster", 22, Rarity.UNCOMMON, mage.cards.s.StrongholdTaskmaster.class));
        cards.add(new SetCardInfo("Sword of the Chosen", 135, Rarity.RARE, mage.cards.s.SwordOfTheChosen.class));
        cards.add(new SetCardInfo("Tempting Licid", 72, Rarity.UNCOMMON, mage.cards.t.TemptingLicid.class));
        cards.add(new SetCardInfo("Thalakos Deceiver", 45, Rarity.RARE, mage.cards.t.ThalakosDeceiver.class));
        cards.add(new SetCardInfo("Tidal Surge", 46, Rarity.COMMON, mage.cards.t.TidalSurge.class));
        cards.add(new SetCardInfo("Tidal Warrior", 47, Rarity.COMMON, mage.cards.t.TidalWarrior.class));
        cards.add(new SetCardInfo("Torment", 23, Rarity.COMMON, mage.cards.t.Torment.class));
        cards.add(new SetCardInfo("Tortured Existence", 24, Rarity.COMMON, mage.cards.t.TorturedExistence.class));
        cards.add(new SetCardInfo("Venerable Monk", 121, Rarity.COMMON, mage.cards.v.VenerableMonk.class));
        cards.add(new SetCardInfo("Verdant Touch", 73, Rarity.RARE, mage.cards.v.VerdantTouch.class));
        cards.add(new SetCardInfo("Victual Sliver", 143, Rarity.UNCOMMON, mage.cards.v.VictualSliver.class));
        cards.add(new SetCardInfo("Volrath's Gardens", 74, Rarity.RARE, mage.cards.v.VolrathsGardens.class));
        cards.add(new SetCardInfo("Volrath's Laboratory", 136, Rarity.RARE, mage.cards.v.VolrathsLaboratory.class));
        cards.add(new SetCardInfo("Volrath's Shapeshifter", 48, Rarity.RARE, mage.cards.v.VolrathsShapeshifter.class));
        cards.add(new SetCardInfo("Volrath's Stronghold", 137, Rarity.RARE, mage.cards.v.VolrathsStronghold.class));
        cards.add(new SetCardInfo("Wall of Blossoms", 75, Rarity.UNCOMMON, mage.cards.w.WallOfBlossoms.class));
        cards.add(new SetCardInfo("Wall of Essence", 122, Rarity.UNCOMMON, mage.cards.w.WallOfEssence.class));
        cards.add(new SetCardInfo("Wall of Razors", 100, Rarity.UNCOMMON, mage.cards.w.WallOfRazors.class));
        cards.add(new SetCardInfo("Wall of Souls", 25, Rarity.UNCOMMON, mage.cards.w.WallOfSouls.class));
        cards.add(new SetCardInfo("Wall of Tears", 50, Rarity.UNCOMMON, mage.cards.w.WallOfTears.class));
        cards.add(new SetCardInfo("Warrior Angel", 123, Rarity.RARE, mage.cards.w.WarriorAngel.class));
        cards.add(new SetCardInfo("Warrior en-Kor", 124, Rarity.UNCOMMON, mage.cards.w.WarriorEnKor.class));
        cards.add(new SetCardInfo("Youthful Knight", 125, Rarity.COMMON, mage.cards.y.YouthfulKnight.class));
    }
}
