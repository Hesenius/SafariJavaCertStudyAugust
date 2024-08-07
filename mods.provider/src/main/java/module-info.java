open module mods.provider {
  exports utils.message to mods.client, does.not.exist;
//  opens utils.message to mods.client;
}