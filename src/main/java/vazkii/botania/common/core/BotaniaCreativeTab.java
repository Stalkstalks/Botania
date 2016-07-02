/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Jan 14, 2014, 5:20:53 PM (GMT)]
 */
package vazkii.botania.common.core;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import vazkii.botania.client.lib.LibResources;
import vazkii.botania.common.Botania;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.block.ModFluffBlocks;
import vazkii.botania.common.core.handler.ConfigHandler;
import vazkii.botania.common.item.ModItems;
import vazkii.botania.common.lib.LibMisc;

public final class BotaniaCreativeTab extends CreativeTabs {

	public static BotaniaCreativeTab INSTANCE = new BotaniaCreativeTab();
	List list;

	public BotaniaCreativeTab() {
		super(LibMisc.MOD_ID);
		setNoTitle();
		setBackgroundImageName(LibResources.GUI_CREATIVE);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(ModItems.lexicon);
	}

	@Override
	public Item getTabIconItem() {
		return getIconItemStack().getItem();
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

	@Override
	public void displayAllReleventItems(List list) {
		this.list = list;

		addItem(ModItems.lexicon);

		addBlock(ModBlocks.flower);
		addBlock(ModBlocks.specialFlower);
		addItem(ModItems.petal);
		addItem(ModItems.pestleAndMortar);
		addItem(ModItems.dye);
		addItem(ModItems.fertilizer);
		addItem(ModItems.flowerBag);
		addItem(ModItems.blackLotus);
		addItem(ModItems.twigWand);
		addItem(ModItems.obedienceStick);
		addItem(ModItems.manaResource);
		addBlock(ModBlocks.storage);
		addItem(ModItems.manaCookie);
		addItem(ModItems.rune);

		addBlock(ModBlocks.avatar);
		addItem(ModItems.dirtRod);
		addItem(ModItems.skyDirtRod);
		addItem(ModItems.cobbleRod);
		addItem(ModItems.terraformRod);
		addItem(ModItems.laputaShard);
		addItem(ModItems.grassHorn);
		addItem(ModItems.waterRod);
		addItem(ModItems.openBucket);
		addItem(ModItems.rainbowRod);
		addBlock(ModBlocks.bifrostPerm);
		addBlock(ModFluffBlocks.bifrostPane);
		addBlock(ModBlocks.shimmerrock);
		addBlock(ModBlocks.shimmerwoodPlanks);
		addItem(ModItems.tornadoRod);
		addItem(ModItems.fireRod);
		addItem(ModItems.smeltRod);
		addItem(ModItems.exchangeRod);
		addItem(ModItems.diviningRod);
		addItem(ModItems.gravityRod);
		addItem(ModItems.missileRod);
		addItem(ModItems.virus);
		addItem(ModItems.slingshot);
		addItem(ModItems.vineBall);
		addItem(ModItems.regenIvy);
		addItem(ModItems.keepIvy);
		addItem(ModItems.worldSeed);
		addItem(ModItems.overgrowthSeed);
		addBlock(ModBlocks.enchantedSoil);
		addItem(ModItems.grassSeeds);
		addBlock(ModBlocks.altGrass);
		if(Botania.thaumcraftLoaded)
			addItem(ModItems.manaInkwell);
		addBlock(ModBlocks.forestDrum);
		addBlock(ModBlocks.forestEye);
		addBlock(ModBlocks.enderEye);
		addItem(ModItems.enderHand);
		addItem(ModItems.spellCloth);
		addItem(ModItems.craftingHalo);
		addItem(ModItems.autocraftingHalo);
		addItem(ModItems.spawnerMover);
		addBlock(ModBlocks.spawnerClaw);
		addBlock(ModBlocks.cocoon);
		addBlock(ModBlocks.teruTeruBozu);
		addItem(ModItems.slimeBottle);
		addItem(ModItems.sextant);
		addItem(ModItems.blackHoleTalisman);

		if(Botania.gardenOfGlassLoaded) {
			addBlock(ModBlocks.root);
			addItem(ModItems.waterBowl);
		}

		addBlock(ModBlocks.livingrock);
		addBlock(ModBlocks.livingwood);
		addBlock(ModBlocks.openCrate);
		addItem(ModItems.craftPattern);
		addBlock(ModBlocks.platform);
		addBlock(ModBlocks.alfPortal);
		addBlock(ModBlocks.altar);
		addBlock(ModBlocks.runeAltar);
		addBlock(ModBlocks.terraPlate);
		addBlock(ModBlocks.brewery);
		addItem(ModItems.vial);
		addItem(ModItems.brewVial);
		addItem(ModItems.brewFlask);
		addBlock(ModBlocks.incensePlate);
		addItem(ModItems.incenseStick);
		addItem(ModItems.bloodPendant);
		addBlock(ModBlocks.felPumpkin);
		addBlock(ModBlocks.pylon);
		addBlock(ModBlocks.pistonRelay);
		addBlock(ModBlocks.hourglass);

		addBlock(ModBlocks.redStringContainer);
		addBlock(ModBlocks.redStringDispenser);
		addBlock(ModBlocks.redStringFertilizer);
		addBlock(ModBlocks.redStringComparator);
		addBlock(ModBlocks.redStringRelay);
		addBlock(ModBlocks.redStringInterceptor);

		addBlock(ModBlocks.tinyPotato);
		addBlock(ModBlocks.starfield);

		addBlock(ModBlocks.dreamwood);
		addBlock(ModBlocks.manaGlass);
		addBlock(ModFluffBlocks.managlassPane);
		addBlock(ModBlocks.elfGlass);
		addBlock(ModFluffBlocks.alfglassPane);

		addItem(ModItems.glassPick);
		addItem(ModItems.manasteelPick);
		addItem(ModItems.manasteelShovel);
		addItem(ModItems.manasteelAxe);
		addItem(ModItems.manasteelShears);
		addItem(ModItems.manasteelSword);
		addItem(ModItems.enderDagger);
		addItem(ModItems.livingwoodBow);
		addItem(ModItems.manasteelHelm);
		if(Botania.thaumcraftLoaded)
			addItem(ModItems.manasteelHelmRevealing);
		addItem(ModItems.manasteelChest);
		addItem(ModItems.manasteelLegs);
		addItem(ModItems.manasteelBoots);
		addItem(ModItems.manaweaveHelm);
		addItem(ModItems.manaweaveChest);
		addItem(ModItems.manaweaveLegs);
		addItem(ModItems.manaweaveBoots);
		addItem(ModItems.elementiumPick);
		addItem(ModItems.elementiumShovel);
		addItem(ModItems.elementiumAxe);
		addItem(ModItems.elementiumShears);
		addItem(ModItems.elementiumSword);
		addItem(ModItems.starSword);
		addItem(ModItems.thunderSword);
		addItem(ModItems.crystalBow);
		addItem(ModItems.elementiumHelm);
		if(Botania.thaumcraftLoaded)
			addItem(ModItems.elementiumHelmRevealing);
		addItem(ModItems.elementiumChest);
		addItem(ModItems.elementiumLegs);
		addItem(ModItems.elementiumBoots);
		addItem(ModItems.terraSword);
		addItem(ModItems.thornChakram);
		addItem(ModItems.terraPick);
		addItem(ModItems.terraAxe);
		addItem(ModItems.temperanceStone);
		addItem(ModItems.terrasteelHelm);
		if(Botania.thaumcraftLoaded)
			addItem(ModItems.terrasteelHelmRevealing);
		addItem(ModItems.terrasteelChest);
		addItem(ModItems.terrasteelLegs);
		addItem(ModItems.terrasteelBoots);
		addItem(ModItems.phantomInk);
		addItem(ModItems.cacophonium);
		addItem(ModItems.recordGaia1);
		addItem(ModItems.recordGaia2);
		addItem(ModItems.ancientWill);
		addItem(ModItems.pinkinator);
		addItem(ModItems.gaiaHead);
		if(ConfigHandler.relicsEnabled) {
			addItem(ModItems.dice);
			addItem(ModItems.infiniteFruit);
			addItem(ModItems.kingKey);
			addItem(ModItems.flugelEye);
			addItem(ModItems.thorRing);
			addItem(ModItems.odinRing);
			addItem(ModItems.lokiRing);
			addItem(ModItems.aesirRing);
		}

		addItem(ModItems.baubleBox);
		addItem(ModItems.tinyPlanet);
		addBlock(ModBlocks.tinyPlanet);
		addItem(ModItems.manaRing);
		addItem(ModItems.auraRing);
		addItem(ModItems.manaRingGreater);
		addItem(ModItems.auraRingGreater);
		addItem(ModItems.waterRing);
		addItem(ModItems.miningRing);
		addItem(ModItems.magnetRing);
		addItem(ModItems.magnetRingGreater);
		addItem(ModItems.swapRing);
		addItem(ModItems.reachRing);
		addItem(ModItems.pixieRing);
		addItem(ModItems.travelBelt);
		addItem(ModItems.superTravelBelt);
		addItem(ModItems.speedUpBelt);
		addItem(ModItems.knockbackBelt);
		addItem(ModItems.itemFinder);
		addItem(ModItems.monocle);
		addItem(ModItems.icePendant);
		addItem(ModItems.lavaPendant);
		addItem(ModItems.superLavaPendant);
		addItem(ModItems.holyCloak);
		addItem(ModItems.unholyCloak);
		addItem(ModItems.goldLaurel);
		addItem(ModItems.divaCharm);
		addItem(ModItems.flightTiara);

		addItem(ModItems.manaTablet);
		addItem(ModItems.manaMirror);
		addItem(ModItems.manaBottle);
		addBlock(ModBlocks.pool);
		addBlock(ModBlocks.alchemyCatalyst);
		addBlock(ModBlocks.conjurationCatalyst);
		addBlock(ModBlocks.distributor);
		addBlock(ModBlocks.manaVoid);
		addBlock(ModBlocks.bellows);
		addBlock(ModBlocks.manaDetector);
		addBlock(ModBlocks.manaBomb);
		addBlock(ModBlocks.ghostRail);
		addItem(ModItems.poolMinecart);
		addBlock(ModBlocks.pump);
		addBlock(ModBlocks.rfGenerator);
		addBlock(ModBlocks.spreader);
		addBlock(ModBlocks.turntable);
		addBlock(ModBlocks.prism);
		addItem(ModItems.lens);
		addItem(ModItems.manaGun);
		addItem(ModItems.clip);
		addItem(ModItems.spark);
		addItem(ModItems.sparkUpgrade);
		addBlock(ModBlocks.sparkChanger);
		addItem(ModItems.corporeaSpark);
		addBlock(ModBlocks.corporeaIndex);
		addBlock(ModBlocks.corporeaFunnel);
		addBlock(ModBlocks.corporeaInterceptor);
		addBlock(ModBlocks.corporeaRetainer);
		addBlock(ModBlocks.corporeaCrystalCube);
		addBlock(ModBlocks.lightRelay);
		addBlock(ModBlocks.lightLauncher);
		addBlock(ModBlocks.cellBlock);

		// FLUFF

		addBlock(ModBlocks.doubleFlower1);
		addBlock(ModBlocks.doubleFlower2);
		addBlock(ModBlocks.shinyFlower);
		addBlock(ModBlocks.floatingFlower);
		addBlock(ModBlocks.floatingSpecialFlower);
		addBlock(ModBlocks.petalBlock);
		addBlock(ModBlocks.mushroom);
		addBlock(ModBlocks.unstableBlock);
		addBlock(ModBlocks.manaBeacon);
		addItem(ModItems.signalFlare);

		addStack(new ItemStack(Blocks.dirt, 1, 1));
		addBlock(ModBlocks.dirtPath);

		addBlock(ModBlocks.prismarine);
		addBlock(ModBlocks.seaLamp);

		addBlock(ModBlocks.blazeBlock);

		addBlock(ModBlocks.reedBlock);
		addBlock(ModBlocks.thatch);

		addBlock(ModBlocks.customBrick);


		addItem(ModItems.quartz);
		if(ConfigHandler.darkQuartzEnabled) {
			addBlock(ModFluffBlocks.darkQuartz);
			if(ConfigHandler.slabsEnabled) {
				addBlock(ModFluffBlocks.darkQuartzSlab);
			}
			if(ConfigHandler.stairsEnabled) {
				addBlock(ModFluffBlocks.darkQuartzStairs);
			}
		}

		
		addBlock(ModFluffBlocks.manaQuartz);
		addBlock(ModFluffBlocks.blazeQuartz);
		addBlock(ModFluffBlocks.lavenderQuartz);
		addBlock(ModFluffBlocks.redQuartz);
		addBlock(ModFluffBlocks.elfQuartz);
		addBlock(ModFluffBlocks.sunnyQuartz);

		if(ConfigHandler.stones18Enabled) {
			addBlock(ModFluffBlocks.stone);
			if(ConfigHandler.stairsEnabled) {
				for(int i = 0; i < 8; i++)
					addBlock(ModFluffBlocks.stoneStairs[i]);
			}
			if(ConfigHandler.slabsEnabled) {
				for(int i = 0; i < 8; i++)
					addBlock(ModFluffBlocks.stoneSlabs[i]);
			}
			if(ConfigHandler.wallsEnabled) {
				addBlock(ModFluffBlocks.stoneWall);
			}
		}

		addBlock(ModFluffBlocks.biomeStoneA);
		addBlock(ModFluffBlocks.biomeStoneB);

		addBlock(ModFluffBlocks.pavement);

		if(ConfigHandler.enderStuff19Enabled) {
			addBlock(ModBlocks.endStoneBrick);
			if(ConfigHandler.stairsEnabled) {
				addBlock(ModFluffBlocks.endStoneStairs);
				addBlock(ModFluffBlocks.enderBrickStairs);
			}
			if(ConfigHandler.slabsEnabled) {
				addBlock(ModFluffBlocks.endStoneSlab);
				addBlock(ModFluffBlocks.enderBrickSlab);
			}
		}
		
		if(ConfigHandler.stairsEnabled) {
			addBlock(ModFluffBlocks.prismarineStairs);
			addBlock(ModFluffBlocks.prismarineBrickStairs);
			addBlock(ModFluffBlocks.darkPrismarineStairs);
			addBlock(ModFluffBlocks.reedStairs);
			addBlock(ModFluffBlocks.thatchStairs);
			addBlock(ModFluffBlocks.netherBrickStairs);
			addBlock(ModFluffBlocks.soulBrickStairs);
			addBlock(ModFluffBlocks.snowBrickStairs);
			addBlock(ModFluffBlocks.tileStairs);
			addBlock(ModFluffBlocks.livingwoodStairs);
			addBlock(ModFluffBlocks.livingwoodPlankStairs);
			addBlock(ModFluffBlocks.livingrockStairs);
			addBlock(ModFluffBlocks.livingrockBrickStairs);
			addBlock(ModFluffBlocks.dreamwoodStairs);
			addBlock(ModFluffBlocks.dreamwoodPlankStairs);
			addBlock(ModFluffBlocks.shimmerwoodPlankStairs);
			addBlock(ModFluffBlocks.shimmerrockStairs);
			addBlock(ModFluffBlocks.manaQuartzStairs);
			addBlock(ModFluffBlocks.blazeQuartzStairs);
			addBlock(ModFluffBlocks.lavenderQuartzStairs);
			addBlock(ModFluffBlocks.redQuartzStairs);
			addBlock(ModFluffBlocks.elfQuartzStairs);
			addBlock(ModFluffBlocks.sunnyQuartzStairs);
			for(int i = 0; i < 24; i++)
				addBlock(ModFluffBlocks.biomeStoneStairs[i]);
			for (Block pavementStair : ModFluffBlocks.pavementStairs)
				addBlock(pavementStair);
		}

		if(ConfigHandler.slabsEnabled) {
			addBlock(ModFluffBlocks.dirtPathSlab);
			addBlock(ModFluffBlocks.prismarineSlab);
			addBlock(ModFluffBlocks.prismarineBrickSlab);
			addBlock(ModFluffBlocks.darkPrismarineSlab);
			addBlock(ModFluffBlocks.reedSlab);
			addBlock(ModFluffBlocks.thatchSlab);
			addBlock(ModFluffBlocks.netherBrickSlab);
			addBlock(ModFluffBlocks.soulBrickSlab);
			addBlock(ModFluffBlocks.snowBrickSlab);
			addBlock(ModFluffBlocks.tileSlab);
			addBlock(ModFluffBlocks.livingwoodSlab);
			addBlock(ModFluffBlocks.livingwoodPlankSlab);
			addBlock(ModFluffBlocks.livingrockSlab);
			addBlock(ModFluffBlocks.livingrockBrickSlab);
			addBlock(ModFluffBlocks.dreamwoodSlab);
			addBlock(ModFluffBlocks.dreamwoodPlankSlab);
			addBlock(ModFluffBlocks.shimmerwoodPlankSlab);
			addBlock(ModFluffBlocks.shimmerrockSlab);
			addBlock(ModFluffBlocks.manaQuartzSlab);
			addBlock(ModFluffBlocks.blazeQuartzSlab);
			addBlock(ModFluffBlocks.lavenderQuartzSlab);
			addBlock(ModFluffBlocks.redQuartzSlab);
			addBlock(ModFluffBlocks.elfQuartzSlab);
			addBlock(ModFluffBlocks.sunnyQuartzSlab);
			for(int i = 0; i < 24; i++)
				addBlock(ModFluffBlocks.biomeStoneSlabs[i]);
			for (Block pavementSlab : ModFluffBlocks.pavementSlabs)
				addBlock(pavementSlab);
		}

		if(ConfigHandler.slabsEnabled) {
			addBlock(ModFluffBlocks.prismarineWall);
			addBlock(ModFluffBlocks.reedWall);
			addBlock(ModFluffBlocks.livingwoodWall);
			addBlock(ModFluffBlocks.livingrockWall);
			addBlock(ModFluffBlocks.dreamwoodWall);
			addBlock(ModFluffBlocks.biomeStoneWall);
		}

		addItem(ModItems.cosmetic);
	}

	private void addItem(Item item) {
		item.getSubItems(item, this, list);
	}

	private void addBlock(Block block) {
		ItemStack stack = new ItemStack(block);
		block.getSubBlocks(stack.getItem(), this, list);
	}

	private void addStack(ItemStack stack) {
		list.add(stack);
	}

}