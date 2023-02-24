package domain.functional.model;

import domain.functional.service.PlayerCreateService;

public class AddHeroPackDiamond implements AddHeroPack {
    Pack pack;

    public AddHeroPackDiamond(Pack pack){
        this.pack = pack;
    }

    @Override
    public Player addHeroesToDeck(Player player, int tokenRequired){
        return PlayerCreateService.createPlayer(player, tokenRequired, pack.getHeroInPack());
    }
}
